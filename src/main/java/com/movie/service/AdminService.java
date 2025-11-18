package com.movie.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.AdminDao;
import com.movie.dto.AdminDetailsdto;
import com.movie.entity.AdminDetails;
import com.movie.exception.AdminLoginException;

@Service
@Transactional
public class AdminService {
	@Autowired
	public AdminDao adminDao;
	public boolean adminLogin(String emailId,String password)
	{ 
	
		if( adminDao.adminLogin(emailId, password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void adminRegistration(AdminDetailsdto adminDetailsdto)
	{
		AdminDetails adminDetails=new AdminDetails();
		adminDetails.setEmail(adminDetailsdto.getEmail());
		adminDetails.setMobileNumber(adminDetailsdto.getMobileNumber());
		adminDetails.setName(adminDetailsdto.getName());
		adminDetails.setPassword(adminDetailsdto.getPassword());
		adminDetails.setTheaterName(adminDetailsdto.getTheaterName());
		adminDao.insertionAdminDetails(adminDetails);
	}

}
