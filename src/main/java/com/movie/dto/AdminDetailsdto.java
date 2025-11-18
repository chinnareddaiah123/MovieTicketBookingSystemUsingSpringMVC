package com.movie.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

public class AdminDetailsdto {
	private String name;
	private long mobileNumber;
	private String email;
	private String password;
    private String theaterName;
}
