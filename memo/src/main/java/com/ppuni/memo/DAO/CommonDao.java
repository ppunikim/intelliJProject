package com.ppuni.memo.DAO;

import org.springframework.dao.DataAccessException;

import java.util.List;

public interface CommonDao {

    public <E> List<E> getList(String query, Object search) throws DataAccessException;
    public List<Exception> getLists(String query, Object search) throws DataAccessException;
}
