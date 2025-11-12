package com.movie.service;

import org.springframework.stereotype.Service;

import com.movie.exception.AdminLoginException;

@Service
public class AdminService {
	public boolean adminDetailsvalidation(String emailId,String password)
	{
		boolean bool=false;
		if(emailId.equalsIgnoreCase("kishore@gmail.com"))
		{
			bool=true;
		}
		else {
			throw new AdminLoginException("Invalid Emailid");
		}
		if(password.equalsIgnoreCase("113271147"))
		{
		  bool=true;
		}
		else {
			throw new AdminLoginException("Invalid Password");
		}
		return bool;
	}

}
