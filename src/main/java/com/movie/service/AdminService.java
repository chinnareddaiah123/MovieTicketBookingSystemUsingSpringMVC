package com.movie.service;

import org.springframework.stereotype.Service;

import com.movie.exception.AdminLoginException;

@Service
public class AdminService {
	public void adminDetailsvalidation(String emailId,String password)
	{
	
		if(emailId.equalsIgnoreCase("kishore@gmail.com"))
		{
			
		}
		else {
			throw new AdminLoginException("Invalid Emailid");
		}
		if(password.equalsIgnoreCase("113271147"))
		{
		 
		}
		else {
			throw new AdminLoginException("Invalid Password");
		}
	
	}

}
