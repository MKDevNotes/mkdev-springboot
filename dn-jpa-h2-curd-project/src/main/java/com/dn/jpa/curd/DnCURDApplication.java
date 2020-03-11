package com.dn.jpa.curd;

import com.dn.jpa.curd.bean.User;
import com.dn.jpa.curd.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DnCURDApplication {

	public static void main(String[] args) {
		SpringApplication.run(DnCURDApplication.class, args);
    }
    
    @Bean
	public CommandLineRunner demo(UserRepository urepository) {
		return (args) -> {
			// Create users with BCrypt encoded password (user/user, admin/admin)
			User user1 = new User("user", "password", "USER");
			User user2 = new User("admin","password", "ADMIN");
			urepository.save(user1);
			urepository.save(user2); 
		};
	}

}
