package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(appconfigure.class);
        System.out.println("Config file loaded.");


        movie movie = factory.getBean(movie.class);
        System.out.println(movie.getActor());
    }
}
