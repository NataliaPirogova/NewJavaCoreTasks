package by.configuration;

import by.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
@ComponentScan(basePackages = "by")
public class ClassConfig {

    @Bean
    @Scope(value = "prototype")
    public Person customPerson() {
        Random r = new Random();
        return new Person(5, "Rita", r.nextInt(90));
    }
}
