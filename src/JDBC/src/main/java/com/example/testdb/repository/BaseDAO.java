package com.example.testdb.repository;

import java.util.List;

public interface BaseDAO <T>{
    List<T> findAll();
    T findByID(int id);
    boolean create (T t);
    boolean update(T t);
    boolean deleteByID (int id);
}
