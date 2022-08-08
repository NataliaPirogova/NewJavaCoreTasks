package repository;

import model.Person;

import java.util.List;

public interface PersonRepository {
    Person findPersonById(long id);

    List<Person> findAll();

    boolean updatePerson(Person person);

    boolean deletePerson(Person person);

    boolean createPerson(Person person);
}
