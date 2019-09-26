package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(appconfigure.class);
        System.out.println("Config file loaded.");


        movie movie1 = (movie)factory.getBean("movie1");
        movie movie2 = (movie)factory.getBean("movie2");
        System.out.println(movie1.getActor());
        System.out.println(movie1 == movie2);
    }
}
