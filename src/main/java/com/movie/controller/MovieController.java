package com.movie.controller;

import com.movie.dto.MovieDetailsdto;
import com.movie.exception.MovieException;
import com.movie.service.AdminService;
import com.movie.service.MovieDetailsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
    @Autowired
    public AdminService adminService;
    @Autowired
    public MovieDetailsService movieDetailsService;
    
	@RequestMapping("/adminLoginPage")
	public String adminLoginPage()
	{
		System.out.println("login");
		return "adminLogin";
	}
	@RequestMapping("/adminLogin")
	public String adminLogin(String emailId,String password)
	{
		adminService.adminDetailsvalidation(emailId, password);
		return "MovieDetails";
	}
	@RequestMapping("/movieDetails")
	public String MovieDetails(MovieDetailsdto movieDetialsdto) {
		movieDetailsService.movieDetailsValidation(movieDetialsdto);
		return "redirect:/displayMovieDetails";
	}
	@RequestMapping("/displayMovieDetails")
	public String DisplaymovieDetails(Model model) {
		List<MovieDetailsdto> detailsList= movieDetailsService.getMovieDetails();
	
		model.addAttribute("DetailsList",detailsList);
		//model.addAttribute("theaterName", "viswanath");
		return "DisplayMovieDetails";
	}
}
