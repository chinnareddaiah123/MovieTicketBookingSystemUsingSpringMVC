package com.movie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.MoviesDao;
import com.movie.dto.MovieDetailsdto;
import com.movie.entity.MovieDetails;

@Transactional
@Service
public class MovieDetailsService {

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
}
