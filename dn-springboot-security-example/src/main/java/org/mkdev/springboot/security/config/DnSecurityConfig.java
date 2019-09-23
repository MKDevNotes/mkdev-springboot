package org.mkdev.springboot.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author muthukumar thangavinayagam.
 *
 */

@EnableWebSecurity
@Configuration
public class DnSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		
		 PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	        auth.inMemoryAuthentication()
	          .withUser("muthu")
	          .password(encoder.encode("password"))
	          .roles("USER");
		/*
		 * There is no PasswordEncoder mapped for the id added {noop} append password..
		 * 
		 * auth.inMemoryAuthentication()
				.withUser("muthu").password("{noop}test").roles("USER").and()
				.withUser("user1").password("{noop}pass1")
				.roles("ADMIN");*/
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.anyRequest()
			.fullyAuthenticated()
			.and()
			.httpBasic();

		http.csrf().disable();
	}

	/* Basic without Auth
	 * @Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests().anyRequest().permitAll().and().httpBasic();

			http.csrf().disable();
		}*/
}
