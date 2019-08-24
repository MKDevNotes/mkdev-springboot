package com.dn.jpa.relationship.example;

import com.dn.jpa.relationship.example.model.Employee;
import com.dn.jpa.relationship.example.model.EmployeeProfile;
import com.dn.jpa.relationship.example.model.Gender;
import com.dn.jpa.relationship.example.repository.EmployeeProfileRepository;
import com.dn.jpa.relationship.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;

/***
 * @author Muthukumar Thangavinayagam
 */

@SpringBootApplication
public class DnJpaOneToOneExampleApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeProfileRepository employeeProfileRepository;

	public static void main(String[] args) {
		SpringApplication.run(DnJpaOneToOneExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Clean All the table records
		employeeProfileRepository.deleteAll();
		employeeRepository.deleteAll();

		Employee employee = new Employee(
				"Muthukumar",
				"Thangavinayagam",
				"muthukumar.wit@gmail.com",
				"MyPassword");

		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(1982,04,05);

		EmployeeProfile employeeProfile = new EmployeeProfile(
											"+322233",
											 Gender.MALE,
											 dateOfBirth.getTime(),
											"Maruthi nagar",
											"Bangalore",
											"Karnataka",
											"India",
											"530011");

		employee.setEmployeeProfile(employeeProfile);

		employeeProfile.setEmployee(employee);

		employeeRepository.save(employee);

		System.out.println("Employee Data Saved Successfully..");



	}
}
