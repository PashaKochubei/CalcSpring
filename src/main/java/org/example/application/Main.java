package org.example.application;

import org.example.console.ConsoleApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        ConsoleApplication consoleApplication = annotationConfigApplicationContext.getBean("ConsoleApplication", ConsoleApplication.class);
        consoleApplication.run();
    }
}
