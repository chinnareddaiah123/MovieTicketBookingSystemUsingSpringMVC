package com.movie.controller;

import com.movie.exception.MovieException;
import com.movie.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
    @Autowired
    public AdminService adminService;
	@RequestMapping("/adminLoginPage")
	public String adminLoginPage()
	{
		System.out.println("login");
		return "adminLogin";
	}
	@RequestMapping("/adminLogin")
	public String adminLogin(String emailId,String password)
	{
		if(adminService.adminDetailsvalidation(emailId, password))
		{
			return "MovieDetails";
		}
		else
		{
			return "adminLogin";
		}
	}
}
