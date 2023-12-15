package com.Learning.SpringBoot.proj6Inject;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Component
@Named //replacement of Component
class BusinessService {
    private DataService dataService;

    //@Autowired
    @Inject //replacement of Autowired
    public void setDataService(DataService dataService) {
        System.out.println("Setter!");
        this.dataService = dataService;
    }
    public DataService getDataService() {
        System.out.println("Getter");
        return dataService;
    }

}
//@Component
@Named //replacement of Component
class DataService{

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

    public static void main(String[] args){
        try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class))
        {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
