# simplehttp
To be able to run http requests

Checkout project and run below to get you started.
```
mvn install
java -jar target/simplehttp-1.0.jar <host> <Authorization header>
```

### Enable logging add the following JVM parameters
-Dorg.apache.commons.logging.Log=org.apache.commons.logging.impl.SimpleLog<br/>
-Dorg.apache.commons.logging.simplelog.showdatetime=true<br/>
-Dorg.apache.commons.logging.simplelog.log.org.apache.http=DEBUG<br/>
-Dorg.apache.commons.logging.simplelog.log.org.apache.http.wire=ERROR<br/>