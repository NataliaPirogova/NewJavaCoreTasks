package com.example.testdb.repository;

import com.example.testdb.model.Person;

import java.util.List;

public interface PersonDAO extends BaseDAO <Person>{
    List<Person> findByName (String name);
}
