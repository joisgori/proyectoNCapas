package com.uca.capas.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import com.uca.capas.domain.Movie;

public interface MovieDAO {
	
	public List<Movie> findAll() throws DataAccessException;
	public Movie findOne(Integer code) throws DataAccessException;
	public int save (Movie s, Integer newRow) throws DataAccessException;
	public void deleteByFirstName(String name) throws DataAccessException;
}
