package com.uca.capas.dao;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.EntityManager;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.domain.Movie;

@Repository
public class MovieDAOImpl implements MovieDAO{
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	
	@Override
	public List<Movie> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.pelicula order by id_pelicula asc");
		Query query = entityManager.createNativeQuery(sb.toString(),Movie.class);
		List <Movie> resulset = query.getResultList();
		return resulset;
	}
	
	@Override
	public Movie findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		Movie movie = entityManager.find(Movie.class, code);
		return movie;
	}
	
	@Transactional
	public int save(Movie s, Integer newRow) throws DataAccessException {
		try {
			if(newRow==1) entityManager.persist(s); //Si agrego una nueva fila, se usa persist
			else entityManager.merge(s); //Si existe la fila, se usa merge
			entityManager.flush();// Se sincroniza con la base de datos
			return 1;
		}catch(Throwable e) {
			e.printStackTrace();
			return 1;
		}
	}

	@Transactional
	public void deleteByFirstName(String name) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("delete from public.pelicula where nombre_pelicula = " + "'" + name + "'");
		Query query = entityManager.createNativeQuery(sb.toString());
		query.executeUpdate();
	}
	
}
