package com.dn.jpa.curd;

import com.dn.jpa.curd.bean.Employee;
import com.dn.jpa.curd.bean.User;
import com.dn.jpa.curd.repository.EmployeeRepository;
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
	public CommandLineRunner demo(UserRepository urepository,EmployeeRepository employeeRepository) {
		return (args) -> {
			// Create users with BCrypt encoded password (user/user, admin/admin)
			User user1 = new User("user", "password", "USER");
			User user2 = new User("admin","password", "ADMIN");
			urepository.save(user1);
			urepository.save(user2); 
			
			Employee employee1 = new Employee("Robin", "Jackman","Software Engineer", 5500.00);
			employeeRepository.save(employee1);
			
			Employee employee2 = new Employee("Taylor", "Edward", "Software Architect", 7200.00);
			employeeRepository.save(employee2);
			
			
			Employee employee3 = new Employee("Vivian", "Dickens", "Database Administrator", 6000.00);
			employeeRepository.save(employee3);
			
			Employee employee4 = new Employee("Harry", "Clifford", "Database Administrator", 6000.00);		
			employeeRepository.save(employee4);
			
			Employee employee5 = new Employee("Eliza", "Clifford", "Software Engineer",4700.00);
			employeeRepository.save(employee5);
			
			Employee employee6 = new Employee("Nancy", "Newman", "Software Engineer", 6000.00);
			employeeRepository.save(employee6);
			
			Employee employee7 = new Employee("Melinda", "Clifford", "Project Manager", 8680.00);
			employeeRepository.save(employee7);
			
			Employee employee8 = new Employee("Melinda", "Gilbert", "Software Architect", 8000.00);
			employeeRepository.save(employee8);			
		    
		};
	}

}
