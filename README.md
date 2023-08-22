# Swagger generated server

Spring Boot Server 


## Overview  
The application will handle the management of emails intended for users stored in the database.

There are three main tables:

Users: This table includes fields such as ID, NAME, BIRTH_DATE, EMAIL, and STATUS.

Message: This table includes fields like ID, SUBJECT, BODY, SENDER, RECEIVER, and DATE.

Scheduler: This table includes fields such as ID, USER_ID, MESSAGE_ID, STATUS, and DATE.

The plan involves setting up separate databases for USER, MESSAGE, and SCHEDULER registration. You'll implement REST APIs using Spring Boot for operations like insertion, modification, listing, and querying for USER, MESSAGE, and SCHEDULER records.
