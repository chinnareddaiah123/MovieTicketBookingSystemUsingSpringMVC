package com.movie.configure;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@ComponentScan(basePackages = "com.movie")
@Configuration
public class MovieConfiguration {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver()
	{
		return new InternalResourceViewResolver("/",".jsp");
	}
	 @Bean
	public EntityManagerFactory createEntityManagerFactory() {
		return  Persistence.createEntityManagerFactory("MovieTicketBookingSystemUsing_SpringMVC");
	}
	 @Bean
	public EntityManager createEntityManager(EntityManagerFactory entityManagerFactory) {
		return entityManagerFactory.createEntityManager();
	}
	 @Bean
	 public EntityTransaction createEntityTransation(EntityManager entityManager)
	 {
		return entityManager.getTransaction();
	 }
}
