package com.pony.first_all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FirstAllApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstAllApplication.class, args);
//        System.out.println("demo");
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext();
        String[] list = app.getBeanDefinitionNames();
        for (String s : list) {
            System.out.println(s);
        }
    }

}
