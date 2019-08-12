package org.mkdev.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DnHelloworldJspExampleApplication extends SpringBootServletInitializer  {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DnHelloworldJspExampleApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DnHelloworldJspExampleApplication.class, args);
	}

}