package by.service;

import by.model.Person;
import by.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements by.service.PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person findPersonById(long id) {
        return personRepository.findPersonById(id);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public boolean updatePerson(Person person) {
        return personRepository.updatePerson(person);
    }

    @Override
    public boolean deletePerson(Person person) {
        return personRepository.deletePerson(person);
    }

    @Override
    public boolean createPerson(Person person) {
        return personRepository.createPerson(person);
    }
}
