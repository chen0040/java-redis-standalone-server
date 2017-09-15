package com.github.chen0040.redis.server.controllers;


import com.github.chen0040.redis.server.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by xschen on 13/4/2017.
 */
@Controller
public class CommandController {


   @Autowired
   private VersionService versionService;

   @Value("${spring.application.name}")
   private String appName;

   @RequestMapping(value="/kill", method= RequestMethod.GET)
   public void kill(){
      if(versionService.isDefaultProfile()){
         System.exit(0);
      }
   }

   @RequestMapping(value="/ping", method= RequestMethod.GET)
   public @ResponseBody String ping(){
      if(versionService.isDefaultProfile()){
         return appName;
      }
      return "";
   }
}

