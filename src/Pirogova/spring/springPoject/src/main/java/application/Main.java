package application;

import configuration.ClassConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PersonService;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ClassConfig.class);

        PersonService personService = applicationContext.getBean(PersonService.class);

        System.out.println(personService.findAll());
        System.out.println(applicationContext.getBean("customPerson"));
    }
}
