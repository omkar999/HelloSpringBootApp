package com.nextgen.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nextgen.app.entities.User;

@Configuration
public class BeanConfig {

	@Bean
	public User user() {
		User user = new User();
		user.setName("Welcome Coder");
		return user;
	}

}
