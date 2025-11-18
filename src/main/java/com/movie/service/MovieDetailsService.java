package com.movie.service;

import java.util.List;

<<<<<<< HEAD
import javax.transaction.Transactional;

=======
>>>>>>> 4a8bda843b6b79d1c35ba1d9a17660cf2947e544
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.MoviesDao;
import com.movie.dto.MovieDetailsdto;
import com.movie.entity.MovieDetails;

@Transactional
@Service
public class MovieDetailsService {
<<<<<<< HEAD

    @Autowired
    private MoviesDao moviesDao;

    
    public void movieDetailsValidation(MovieDetailsdto dto) {

        MovieDetails movie = new MovieDetails(); // ✔️ Create new object per request

        movie.setMovieName(dto.getMovieName());
        movie.setScreenNo(dto.getScreenNo());
        movie.setTicketPrice(dto.getTicketPrice());
        movie.setAvailableSeats(dto.getAvailableSeats());
        movie.setShowTimings(dto.getShowTimings());
        movie.setTheaterName(dto.getTheaterName());

        moviesDao.insertionMovieDetails(movie);

        System.out.println(movie);
    }
    
    public List<MovieDetails> getAllMovieDetails() {
        return moviesDao.getAllMovieDetails();
    }
=======
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
	
	public List<MovieDetailsdto> getMovieDetails() {
		return moviesDao.getMovieDetails();
	}
>>>>>>> 4a8bda843b6b79d1c35ba1d9a17660cf2947e544
}
