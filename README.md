# LearningSpringBoot

##### This is the repository to store JAVA codes which I have learned with via UDEMY.

##### Followings are descriptions per each package inside 'SpringBoot/src/main/java/com/Learning/SpringBoot/' folder.
--------------
>Structure of proj1
>> game (folder)
>>> GameRunner.java
>>> 
>>> GamingConsole.java (interface)
>>> 
>>> MarioGame.java (@Component)
>>> 
>>> PacmanGame.java  (@Component)
>>> 
>>> SuperContraGame.java (@Component, @Primary)
>> helloSpring (folder)
>>
>> App01GamingBasicJava.java
>>
>> App02GamingConfiguration.java (@Configuration)
>>
>> App03GamingSpringBeans.java
>>
>> SpringBeanVSJavaBean.java

- JAVA sources inside "game" folder explains how good is JAVA for loose-coupling.
- App02GamingConfiguration.java lets us know how to set spring beans in a JAVA class using some annotations such as @Configuration, @Bean.

      ***                   What I have learned from this proj1
  
          - Spring Container (= Spring Context, IOC Container) : Manages Spring beans and their lifecycle.
          - Application Context : Easy to use in web applications and easy to integrate with SPRING AOP (Aspect Oriented Programming).
          - Bean Factory : Basic Spring Container
          - Java Bean : Has public default constructors, Allow access to their properties using getter and setter, implement hava.io.Serializable
          - POJO : Plain Old Java Object. Any java object is a POJO
          - Spring Bean : Any Java object that is managed by Spring. Spring uses IOC Conatiner to manage these beans.
          - If multiple matching beans have been found, we can choose between @Qualifier and @Primary.
                                                                                                        ***
--------------
>Structure of proj2
>> BusinessCalculationService.java (@Service)
>>
>> DataService.java (interface)
>>
>> MongoDBDateService.java (@Repository, @Primary)
>>
>> MySQLDataService.java (@Repository)
>>
>> RealWorldSpringContextLauncher.java (@Configuration, @ComponentScan)


