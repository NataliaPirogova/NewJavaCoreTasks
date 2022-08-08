package repository;

import model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    private final List<Person> storage = List.of(new Person(1, "Nataly", 27),
            new Person(2, "Raisa", 25),
            new Person(3, "Elena", 56),
            new Person(4, "Igor", 60));

    @Override
    public Person findPersonById(long id) {
        for (Person p :
                storage) {
            if (id == p.getId()) {
                return p;
            }
            return null;
        }
        return null;
    }

    @Override
    public List<Person> findAll() {
        return storage;
    }

    @Override
    public boolean updatePerson(Person person) {
        for (int i = 0; i < storage.size(); i++) {
            if (person.getId() == storage.get(i).getId()) {
                storage.add(i, person);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deletePerson(Person person) {
        for (int i = 0; i < storage.size(); i++) {
            if (person.getId() == storage.get(i).getId()) {
                storage.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean createPerson(Person person) {
        storage.add(person);
        return true;
    }
}
