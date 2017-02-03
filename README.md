# simplehttp
To be able to run http requests

-1 mvn install
-2 java -jar target/simplehttp-1.0.jar <host> <Authorization header>

Enable logging with 
-Dorg.apache.commons.logging.Log=org.apache.commons.logging.impl.SimpleLog
-Dorg.apache.commons.logging.simplelog.showdatetime=true
-Dorg.apache.commons.logging.simplelog.log.org.apache.http=DEBUG
-Dorg.apache.commons.logging.simplelog.log.org.apache.http.wire=ERROR