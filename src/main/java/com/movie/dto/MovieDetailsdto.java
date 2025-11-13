package com.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDetailsdto {
	public static String theatername="Viswanath Multiplex";
//	private int movieId;
	private String movieName;
	private String screenNo;
	private double TicketPrice;
	private int availableSeats;
	private String showTimeings;

}
