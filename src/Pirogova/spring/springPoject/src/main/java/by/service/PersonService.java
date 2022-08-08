package by.service;

import by.model.Person;

import java.util.List;

public interface PersonService {
    Person findPersonById(long id);

    List<Person> findAll();

    boolean updatePerson(Person person);

    boolean deletePerson(Person person);

    boolean createPerson(Person person);
}
