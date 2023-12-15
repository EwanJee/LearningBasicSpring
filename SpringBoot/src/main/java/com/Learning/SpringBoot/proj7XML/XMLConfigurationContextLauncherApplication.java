package com.Learning.SpringBoot.proj7XML;

import com.Learning.SpringBoot.proj1.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * We don't need @Configuration and @ComponentScan anymore because we already set spring beans in xml
 */
public class XMLConfigurationContextLauncherApplication {
    public static void main(String[] args){

        try(var context =
                    new ClassPathXmlApplicationContext("contextConfiguration.xml"))
        {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            context.getBean(GameRunner.class).run();
        }

    }
}
