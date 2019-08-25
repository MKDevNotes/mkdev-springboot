package com.dn.jpa.relationship.otm;

import com.dn.jpa.relationship.otm.model.DnDepartment;
import com.dn.jpa.relationship.otm.model.DnEmployee;
import com.dn.jpa.relationship.otm.repository.DnDepartmentRepository;
import com.dn.jpa.relationship.otm.repository.DnEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Calendar;

@SpringBootApplication
public class DnJpaOneToManyApplication implements CommandLineRunner{

	@Autowired
	private DnEmployeeRepository employeeRepository;

	@Autowired
	private DnDepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DnJpaOneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.deleteAll();
		departmentRepository.deleteAll();

		Calendar dateOfBirth = getCalendar(1982,04,4);

		Calendar dateOfJoin = getCalendar(2010,12,9);

		DnEmployee employee1 = new DnEmployee("Muthukumar","Thangavinayagam",433.3,dateOfBirth.getTime(),dateOfJoin.getTime(),"Erode","Sample Desc");

		DnDepartment department = new DnDepartment();
					 department.setDepartmentName("Department1");
					 department.setDepartmentLocation("Bangalore");
					 department.setText("Sample Text demo..");
		department.setDnEmployee(employee1);

		//departmentRepository.save(department);

		employeeRepository.save(employee1);

		System.out.println("Employee Data Saved Successfully..");


	}

	private Calendar getCalendar(int year,int month,int date) {
		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(year, month, date);
		return dateOfBirth;
	}
}
