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

    private String theaterName ;  

    private String movieName;

    private String screenNo;

    private double ticketPrice; 

    private int availableSeats;

    private String showTimings; 
}
