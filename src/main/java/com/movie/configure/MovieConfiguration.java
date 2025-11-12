package com.movie.configure;

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

}
