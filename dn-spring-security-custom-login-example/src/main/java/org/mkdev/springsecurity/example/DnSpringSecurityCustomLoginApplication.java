package org.mkdev.springsecurity.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class DnSpringSecurityCustomLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(DnSpringSecurityCustomLoginApplication.class, args);
	}

}



// To Resolve /error status:500 issue.  @EnableAutoConfiguration -> ErrorMvcAutoConfiguration.css - > 