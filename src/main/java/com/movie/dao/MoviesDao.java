package com.movie.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.movie.entity.MovieDetails;

@Component
public class MoviesDao {
	@Autowired
	public EntityManagerFactory entityManagerFactory;
	@Autowired
	public EntityManager entityManager;
	public void insertionMovieDetails(MovieDetails movieDetails) {
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(movieDetails);
		entityTransaction.commit();
	}
}
