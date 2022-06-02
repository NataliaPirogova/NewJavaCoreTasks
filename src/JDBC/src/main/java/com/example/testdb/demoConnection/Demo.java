package com.example.testdb.demoConnection;

import com.example.testdb.connection.JDBCConnector;
import com.example.testdb.model.Person;
import com.example.testdb.repository.implementation.PersonDAOImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {
        JDBCConnector connector1 = new JDBCConnector();
        PersonDAOImpl personDAO = new PersonDAOImpl(connector1);
        Person person = new Person("Dima", "Minsk", 39);
        //personDAO.create(person);
        personDAO.findAll().forEach(System.out::println);

//        try(Connection con1 = connector1.getConnection()) {
//            System.out.println(con1.isClosed());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
    }
}
