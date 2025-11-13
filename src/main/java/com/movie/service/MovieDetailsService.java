package com.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.MoviesDao;
import com.movie.dto.MovieDetailsdto;
import com.movie.entity.MovieDetails;
@Service
public class MovieDetailsService {
	@Autowired
	MovieDetails movieDetails;
	@Autowired
	MoviesDao moviesDao;
	public void movieDetailsValidation(MovieDetailsdto movieDetailsdto) {
		movieDetails.setAvailableSeats(movieDetailsdto.getAvailableSeats());
		movieDetails.setMovieName(movieDetailsdto.getMovieName());
		movieDetails.setScreenNo(movieDetailsdto.getScreenNo());
		movieDetails.setShowTimeings(movieDetailsdto.getShowTimeings());
		movieDetails.setTicketPrice(movieDetailsdto.getTicketPrice());
		moviesDao.insertionMovieDetails(movieDetails);
	}
}
