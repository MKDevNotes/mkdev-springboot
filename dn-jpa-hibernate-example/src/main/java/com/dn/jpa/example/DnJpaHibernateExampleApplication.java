package com.dn.jpa.example;

import com.dn.jpa.example.model.Address;
import com.dn.jpa.example.model.User;
import com.dn.jpa.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Muthukumar Thangavinayagam.
 *
 */

@SpringBootApplication
public class DnJpaHibernateExampleApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {

		SpringApplication.run(DnJpaHibernateExampleApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//Cleanup database tables
		userRepository.deleteAll();

		//Insert a User with multiple phone numbers and address.
		Set<String> userPhoneNumber = new HashSet<String>();
					userPhoneNumber.add("234-322-2356");
					userPhoneNumber.add("224-222-2222");

					Address address1 = new Address();
					address1.setAddressLine1("Address1 Line One");
					address1.setAddressLine2("Address1 Line Two");
					address1.setCity("Bangalore");
					address1.setState("Karnataka");
					address1.setCountry("India");
					address1.setZipcode("530066");

					Address address2 = new Address();
					address2.setAddressLine1("Address2 Line One");
					address2.setAddressLine2("Address2 Line Two");
					address2.setCity("Erode");
					address2.setState("Tamil Nadu");
					address2.setCountry("India");
					address2.setZipcode("638011");

		Set<Address> userAddress = new HashSet<Address>();
					userAddress.add(address1);
					userAddress.add(address2);

		User userDetail = new User("Muthukumar","muthukumar.wit@gmail.com",userPhoneNumber,userAddress);

		userRepository.save(userDetail);

		System.out.println("User Register Successfully");
	}
}


