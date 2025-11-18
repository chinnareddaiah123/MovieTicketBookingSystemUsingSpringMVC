package com.movie.controller;

import com.movie.dto.AdminDetailsdto;
import com.movie.dto.MovieDetailsdto;
import com.movie.entity.MovieDetails;
import com.movie.exception.MovieException;
import com.movie.service.AdminService;
import com.movie.service.MovieDetailsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {
    @Autowired
    public AdminService adminService;
    @Autowired
    public MovieDetailsService movieDetailsService;
    @RequestMapping("/adminRegistrationPage")
    public String adminRegistrationpage()
    {
    	return "AdminRegistration";
    }
   
    @RequestMapping("/adminRegistration")
    public String adminregistration(AdminDetailsdto adminDetailsdto)
    {
    	adminService.adminRegistration(adminDetailsdto);
    	return "index";
    }
	@RequestMapping("/adminLoginPage")
	public String adminLoginPage()
	{
		System.out.println("login");
		return "adminLogin";
	}
	@RequestMapping("/adminLogin")
	public String adminLogin(String emailId,String password)
	{
		if(adminService.adminLogin(emailId, password))
		{
			return "operations";
		}
		else
		{
			return "redirect:/adminLogin";
		}
		
		
	}
	@RequestMapping("/addMovies")
	public String addMovies()
	{
		return "MovieDetails";
	}
	@RequestMapping("/showOptions")
	public String showOperations()
	{
		return "operations";
	}
	
	@RequestMapping("/addMovieDetails")
	public String addMovieDetails(MovieDetailsdto movieDetailsdto) {
		movieDetailsService.movieDetailsValidation(movieDetailsdto);
		return "MovieDetails";
	}
	
	 

	    
//	@RequestMapping("/addMovies")
//	public String addMovieDetails(Model model)
//	{
//		model.addAttribute("moviedetails", new MovieDetails());
////		
////		System.out.println(movieDetialsdto);
//		return "MovieDetails";
//	}
//	@RequestMapping("/addMovieDetails")
//	public String addMovieDetails( MovieDetailsdto movieDetailsdto)
//	{
//		
//		movieDetailsService.movieDetailsValidation(movieDetailsdto);
//		return "redirect:/addMovies";
//	}
	@GetMapping("/showMovieDetails")
    public String showMovieDetails(Model model) {

        List<MovieDetails> list = movieDetailsService.getAllMovieDetails();
        model.addAttribute("movies", list);

        return "DisplayAllMovieDetails";
    }
	@RequestMapping("/userOperations")
	public String userOperations()
	{
		return "UserOperations";
	}
}
