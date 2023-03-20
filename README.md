**!! Spring Boot Learnings !!**

    1. **SPRING PROFILES**
        # Create a Spring Profile to use for different environments - dev/qa/stage/prod
        # Change the below line to any of the above available environments. Make sure to
        # create the specific application-<env>.properties file for each environment.
            spring.profiles.active=prod
            <img src="C:\Users\JoshiAniruddha\Documents\learning\projects\learn-spring-boot\images\img.png" title="Properties File Structure"/>
    2. **ConfigurationProperties**
        # Configuration Properties. Below properties are used under CurrencyServiceConfiguration class
        # These properties can be specific to profiles - dev/prod
            currency-service.url=http://default1.currency-service.com
            currency-service.username=defaultusername
            currency-service.key=defaultkey
        **PROD Profile Configuration**
            # Configuration Properties. Below properties are used under CurrencyServiceConfiguration class
                currency-service.url=http://prod.currency-service.com
                currency-service.username=produsername
                currency-service.key=prodkey