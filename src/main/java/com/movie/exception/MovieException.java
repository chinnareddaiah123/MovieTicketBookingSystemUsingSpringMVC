package com.movie.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MovieException {
	@ExceptionHandler(AdminLoginException.class)
	public String adminException(AdminLoginException adminLoginException,Model model)
	{
		String exeptionmsg=adminLoginException.getExceptionMessage();
		model.addAttribute("exeptionmsg", exeptionmsg);
		return "adminLogin";
	}

}
