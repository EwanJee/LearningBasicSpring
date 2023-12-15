# LearningSpringBoot

 이 레포지토리를 통해 UDEMY에서 배운 JAVA CODE를 복습하고 제가 배우고 느낀 것들을 기록합니다.

 SpringBoot/src/main/java/com/Learning/SpringBoot/' 폴더 내 각 패키지에 대한 설명입니다.

 
--------------
> proj1 구조
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
>> 

- "game" 폴더 내의 JAVA 소스는 JAVA가 느슨한 결합(Loose-Coupling)을 위해 얼마나 좋은지 설명합니다.
- App02GamingConfiguration.java는 @Configuration, @Bean과 같은 어노테이션을 사용하여 JAVA 클래스에서 spring bean을 어떻게 설정하는지를 보여줍니다.

      ***                   proj1을 통해 배운 내용
  
          - Spring Container (= Spring Context, IOC Container) : Spring Bean 및 그 라이프사이클을 관리합니다.
  
          - Application Context : 웹 애플리케이션에서 쉽게 사용하며 SPRING AOP (Aspect Oriented Programming)과 쉽게 통합됩니다.
  
          - Bean Factory : 기본적인 Spring Container
  
          - Java Bean : public 기본 생성자를 가지며, getter와 setter를 사용하여 속성에 액세스 할 수 있으며, java.io.Serializable을 구현합니다.
  
          - POJO : Plain Old Java Object. 모든 Java 객체는 POJO입니다.
  
          - Spring Bean : Spring에 의해 관리되는 모든 Java 객체. Spring은 IOC Container를 사용하여 이러한 Bean을 관리합니다.

  
          - 여러 일치하는 Bean이 발견되면 @Qualifier 및 @Primary 중에서 선택할 수 있습니다.
                                                                                                        ***
--------------
> proj2 구조
>> BusinessCalculationService.java (@Service)
>>
>> DataService.java (interface)
>>
>> MongoDBDateService.java (@Repository, @Primary)
>>
>> MySQLDataService.java (@Repository)
>>
>> RealWorldSpringContextLauncher.java (@Configuration, @ComponentScan)
>> 

      ***                  proj2를 통해 배운 내용
  
          - 의존성 주입 유형
      
          -- 생성자 기반
      
          -- Setter 기반
      
          -- 필드 기반
          
          -> Spring 팀은 생성자 기반 주입을 권장합니다.

          - @Service : 비즈니스 로직을 보유합니다. 

          - @Repository : 영속성과 관련된 예외를 처리합니다.                                     ***
                                                                                                        

---------------
                                                                                                        
>Structure of proj3
>> LazyInitializationLauncherApplication.java (@Configuration, @ComponentScan)
>>> ClassA (@Component)
>>> ClassB (@Component, @Lazy)

     ***                 proj3를 통해 배운 내용
  
          - 자바 객체에서 LAZY 와 EAGER의 차이
          -- EAGER : 연관된 객체를 한꺼번에 로딩한다
          -- LAZY : 요청이 있을 시 연관된 객체를 로딩한다
                                                                                         ***
                                                                                                    

