package dao;

import java.sql.SQLException;

public interface IDao<T>{
    public T save(T t) throws SQLException;
}

