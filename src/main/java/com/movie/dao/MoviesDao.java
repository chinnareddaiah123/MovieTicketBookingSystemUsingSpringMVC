package com.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.movie.entity.MovieDetails;

@Component
public class MoviesDao {

    private final MovieDetails movieDetails;
	@Autowired
	public EntityManagerFactory entityManagerFactory;
	@Autowired
	public EntityManager entityManager;

    MoviesDao(MovieDetails movieDetails) {
        this.movieDetails = movieDetails;
    }
	public void insertionMovieDetails(MovieDetails movieDetails) {
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(movieDetails);
		entityTransaction.commit();
		entityManager.clear();
	}
	public List<MovieDetails> getAllMovieDetails()
	{
		String select="select movieDetails from MovieDetails movieDetails";
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Query query=entityManager.createQuery(select);
		List<MovieDetails> list=query.getResultList();
		entityManager.clear();
		return list;
	}
}
