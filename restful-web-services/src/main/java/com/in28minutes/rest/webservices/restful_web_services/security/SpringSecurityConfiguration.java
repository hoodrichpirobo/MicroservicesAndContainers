package com.in28minutes.rest.webservices.restful_web_services.security;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.web.*;
import static org.springframework.security.config.Customizer.*;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated()
				);
		
		http.httpBasic(withDefaults());
		
		http.csrf().disable();
		
		return http.build();
	}
}
