package com.Learning.SpringBoot.proj5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency someDependency;

    @Autowired
    public SomeClass(SomeDependency someDependency){
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }
    @PostConstruct
    //The PostConstruct annotation is used on a method that needs to be executed after dependency injection
    public void initialize(){
        someDependency.getReady();
    }
    @PreDestroy
    // Signal that the instance being removed by the container
    public void cleanUp(){
        System.out.println("Clean that shit Up");
    }
}

@Component
class SomeDependency{
    public void getReady(){
        System.out.println("Some logic using SomeDependency");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args){

        try(
                var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);

                ){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
