

Vivek sir topics:
1. Spring 6 and JDK 17.*
2. TLS 1.3? What is new in TLS 1.3. It supports red hat 8 linux or above only.* 
    1.3 takes less time in handshake compared to previous versions

3. Spring boot*  --> Done
4. Database* --> Done except indexes and Execution plan
5. Rest api
6. Security*: Spring is only application security. Platform security(hardenening boxes with patches), Network and communication security(

    Eg, Tomcat and database server and various which are configured using TLS certificates



) 


After platform and network security is broken then application security comes into picture.

PS is handled by infra team. 


Docker, kube. Aws


MQs(IBM mq and kafka. In depth Q/A. Difference between kafka and MQ)


High avavilablity and load balancer. Useing ApacheHTTp and connecting multiple tomcats to apache server for load balancing.

JUNIT and SONAR.***
JUnit and mokito practical examples


Not just war, any artifact can be converted to rpm file


Database-Synonyms, views, materialized views, joins


Dubugging--> Start with functional use case and then go into technicality.


Dont say not very comfortable. Get functional understanding atleast.




Web.xml, App.xml, session replication, Spring mvc flow, LDAP usage


Apache load balancers are defined which internally route on one or another



DB---> data sources, connection pool, views, materialized views(refresh view created by jobs which keeps checking the delta of the table)*


USe case for materialized views for high volume of data. We create oracle/cron jobs for refreshing

Spring mvc flow






Container managed connection,, managed by beans/hibernate. 
Bean managed connection and container managed connection by spring.jdbc templates.


In case of single 

If entire transaction rollback is not required?

Spring security*


ASk for log files for debugging*
Different labels --> info, debug* priority wise

Log labels?*

JNDI and resource transparency

How to connect to db with jndi


No if else
Private and public comments
Correct variable names for readability
Say simple points first
SOLID principles




Approach:

Business case- user wants
Use case- what you'll implement
Technical details
Impact area of use case --> backward compatibilty*
Once analysis is done I will break big task into smaller units  --> based on different impacted components
Check for challenges in use case in which case get clarification or check for impediment earliest

If impediment is impacting one use case work on other use case by breaking down tasks
Exaustive Junit classes are written
Best practices and proper logging is implemented



Hibernate limitation:
Complex queries
overhead
stick to one framework
lincences




Gang of four design pattern .3



write heavy case because of indexes



Topics and queues --> java questions on mqs .2

dead letter queue (Queue where messages that cannot be processed are sent) // queue doesnt exist,

pub sub model(publishers publish messages to a central broker from where messages are subscribed. Useful for systems requiring real timme updates),

point to point(single consumer, reliability, order is maintained), 

backout queue(queue which stores messages that cannot be processed after multiple attempts. Like DLQ but with retries configured),

queue manager(system used for handling and managing queues in a messaging system. Creating, deleting and manging queues. routing messages to corect queues based on routing rules defined) , 

queue channel(communication pathway between a queue manager and a queue or between ywo queue managers. Message transfer, Securing communication, optimization)




MQ host,  port ibm mq configuration, queue manager channel request response,





cluster indexes








code coverage and check style


deep dive into rpm and various configurations and spec file


Db performance optimizations .1



Logging label priority .1 log4j.xmlS

OFF: The highest possible rank and is intended to turn off logging.
FATAL: Indicates severe errors that cause premature termination.
ERROR: Signifies other runtime errors or unexpected conditions.
WARN: Designates potentially harmful situations.
INFO: Messages that convey some information.
DEBUG: Messages that convey detailed information for debugging.
TRACE: The lowest rank and designed to offer more detailed information than DEBUG.
ALL: Intended to turn on all logging.

