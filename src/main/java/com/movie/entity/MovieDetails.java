package com.movie.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@javax.persistence.Entity
public class MovieDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	public static String theatername="Viswanath Multiplex";
	private String movieName;
	private String screenNo;
	private double TicketPrice;
	private int availableSeats;
	private String showTimeings;
}
