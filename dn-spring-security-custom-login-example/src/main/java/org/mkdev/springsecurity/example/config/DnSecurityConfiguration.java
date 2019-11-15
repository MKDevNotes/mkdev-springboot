package org.mkdev.springsecurity.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class DnSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/").permitAll()
				.antMatchers("/login").permitAll().antMatchers("/userRegister")
				.permitAll().antMatchers("/reset").permitAll()
				.antMatchers("/admin/**").hasAuthority("ADMIN").anyRequest()
				.authenticated().and().csrf().disable().formLogin()
				.loginPage("/login").failureUrl("/login?error=true")
				.defaultSuccessUrl("/successPage").usernameParameter("email")
				.passwordParameter("password").and().logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/userLogout"))
				.logoutSuccessUrl("/").and().exceptionHandling()
				.accessDeniedPage("/access-denied")
				.and()
                .sessionManagement()
                .maximumSessions(-1)
                .expiredUrl("/login?isExpired=true").maxSessionsPreventsLogin(true);
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		System.out.println(" Inside Config AUthenticationManager....");
		PasswordEncoder encoder = PasswordEncoderFactories
				.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication().withUser("muthu")
				.password(encoder.encode("password")).roles("ADMIN");

		System.out.println("Inside Config Manager...");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**",
				"/js/**", "/images/**", "/webjars/**");
	}

	//https://www.techiedelight.com/display-custom-error-pages-in-spring-boot/
}
