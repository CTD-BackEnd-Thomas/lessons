package com.dh.dentalclinic.dao;

import java.sql.SQLException;

public interface IDao<T>{
    public T save(T t) throws SQLException;
    public T update(T t) throws SQLException;
}
