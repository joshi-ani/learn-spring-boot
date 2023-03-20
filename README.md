**!! Spring Boot Learnings !!**

1. **<u>SPRING PROFILES</u>**
        Create a Spring Profile to use for different environments - dev/qa/stage/prod
        Change the below line to any of the above available environments. 
        <p>Make sure to create the specific application-\<env>.properties file for each environment.
            <p>&emsp;spring.profiles.active=prod
            <p>&emsp;<img src="C:\Users\JoshiAniruddha\Documents\learning\projects\learn-spring-boot\images\img.png" title="Properties File Structure"/>
2. **<u>ConfigurationProperties</u>**
        Configuration Properties. Below properties are used under CurrencyServiceConfiguration class
        These properties can be specific to profiles - dev/prod
            <p>&emsp;currency-service.url=http://default1.currency-service.com
            <p>&emsp;currency-service.username=defaultusername
            <p>&emsp;currency-service.key=defaultkey
        <p>**<u>PROD Profile Configuration</u>**
                <p>Below properties are used under CurrencyServiceConfiguration class
                <p>&emsp;currency-service.url=http://prod.currency-service.com
                <p>&emsp;currency-service.username=produsername
                <p>&emsp;currency-service.key=prodkey
3. **<u>Logging Levels</u>**
           <p>Each profile can have a different logging level.
           For example: The DEV profile can have a logging level of TRACE. Or the PROD profile will always have a logging
           level of ERROR/INFO.
           <p>The logging level can be set in the application.properties file as follows:
                <p>&emsp;logging.level.org.springframework=trace
4. **<u>Actuator</u>**
        <p>Actuator is used to display the health management of the applications.
        To configure actuator, add the **_spring-boot-starter-actuator_** dependency in the pom.xml file.
        To view the health of the application, after restarting the application, go to browser and hit "http://localhost:8080/actuator".
        To expose more features that actuator provides, update the application.properties with the following property:
        <p>Expose Actuator endpoints</br>
               &emsp;management.endpoints.web.exposure.include=*</p></p>