package com.movie.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MovieFrontEndController  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class [] configurationclasses= {MovieConfiguration.class};
		return configurationclasses;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String [] mapping= {"/"};
		return mapping;
	}

}
