package com.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.movie.configure.MovieConfiguration;
import com.movie.dto.MovieDetailsdto;
import com.movie.entity.MovieDetails;

@Component
public class MoviesDao {

<<<<<<< HEAD
    private final MovieDetails movieDetails;
=======
    private final MovieConfiguration movieConfiguration;
>>>>>>> 4a8bda843b6b79d1c35ba1d9a17660cf2947e544
	@Autowired
	public EntityManagerFactory entityManagerFactory;
	@Autowired
	public EntityManager entityManager;

<<<<<<< HEAD
    MoviesDao(MovieDetails movieDetails) {
        this.movieDetails = movieDetails;
=======
    MoviesDao(MovieConfiguration movieConfiguration) {
        this.movieConfiguration = movieConfiguration;
>>>>>>> 4a8bda843b6b79d1c35ba1d9a17660cf2947e544
    }
	public void insertionMovieDetails(MovieDetails movieDetails) {
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(movieDetails);
		entityTransaction.commit();
		entityManager.clear();
	}
<<<<<<< HEAD
	public List<MovieDetails> getAllMovieDetails()
	{
		String select="select movieDetails from MovieDetails movieDetails";
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Query query=entityManager.createQuery(select);
		List<MovieDetails> list=query.getResultList();
		entityManager.clear();
		return list;
=======
	
	public List<MovieDetailsdto> getMovieDetails() {
		String select="select movieDetails from  MovieDetails movieDetails";
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Query query=entityManager.createQuery(select);
      
		List<MovieDetailsdto> li=query.getResultList();
		System.out.println(li);
		return li;
		
		
>>>>>>> 4a8bda843b6b79d1c35ba1d9a17660cf2947e544
	}
}
