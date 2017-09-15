# java-redis-standalone-server

Simple java redis standalone server that can run on both windows and other OS without additional setup

# Feature

* Standalone redis server that can run without additional installation on Windows, Linux and MacOS.
* Allow shut down of the redis server remotely via web api call

# Usage
copy the redis-standalone.jar to your directory and run the following command:

```bash
java -jar redis-standalone.jar
```

This will start the redis server at port 6379 and start another web server at port 7379.

To check whether the redis server is alive, call the following url:

http://localhost:7379/ping

To kill the redis server remotely, just call the following url:

http://localhost:7379/kill



