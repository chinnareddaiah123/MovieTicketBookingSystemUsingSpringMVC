package com.movie.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.movie.dto.AdminDetailsdto;
import com.movie.entity.AdminDetails;


@Component
public class AdminDao {

    private final AdminDetailsdto adminDetailsdto;
	@Autowired
	public EntityManagerFactory entityManagerFactory;
	@Autowired
	public EntityManager entityManager;
	@Autowired
    public EntityTransaction entityTransaction;

    AdminDao(AdminDetailsdto adminDetailsdto) {
        this.adminDetailsdto = adminDetailsdto;
    }
	public void insertionAdminDetails(AdminDetails adminDetails)
	{
		entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(adminDetails);
		entityTransaction.commit();
		entityManager.clear();
	}
//	public boolean adminLogin(String email,String password)
//	{
//		String select="select adminDetails from AdminDetails adminDetails where adminDetails.email=?1 and adminDetails.password=?2";
//		entityManager.getTransaction();
//		entityTransaction.begin();
//		Query query=entityManager.createQuery(select);
//		query.setParameter(1, email);
//		query.setParameter(2, password);
//		 
//		ArrayList<AdminDetails> list=new ArrayList<AdminDetails>();
//          list.add((AdminDetails) query.getSingleResult());
//          if(list.isEmpty())
//        	  return false;
//          else
//        	  return true;
//        			  
//		
//        
//	}
	public boolean adminLogin(String email, String password) {
	    String select = "select adminDetails from AdminDetails adminDetails "
	            + "where adminDetails.email=?1 and adminDetails.password=?2";

	    entityTransaction.begin();

	    Query query = entityManager.createQuery(select);
	    query.setParameter(1, email);
	    query.setParameter(2, password);

	    try {
	        AdminDetails admin = (AdminDetails) query.getSingleResult();
	        return admin != null;   // login success
	    } catch (NoResultException e) {
	        return false;           // login failed
	    }
	}

}
