 package com.bhaiti.kela.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.bhaiti.kela.Controller"})
public class SpringBootRestStatusReport1Application extends SpringBootServletInitializer {

	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(SpringBootRestStatusReport1Application.class);
	   }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestStatusReport1Application.class, args);
	}

}
