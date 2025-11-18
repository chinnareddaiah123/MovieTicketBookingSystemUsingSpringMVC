package com.movie.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class MovieDetailsdto {
<<<<<<< HEAD
=======
	public static String theatername="Viswanath Multiplex";
	private int movieId;
	private String movieName;
	private String screenNo;
	private double TicketPrice;
	private int availableSeats;
	private String showTimeings;
>>>>>>> 4a8bda843b6b79d1c35ba1d9a17660cf2947e544

    private String theaterName ;  

    private String movieName;

    private String screenNo;

    private double ticketPrice; 

    private int availableSeats;

    private String showTimings; 
}
