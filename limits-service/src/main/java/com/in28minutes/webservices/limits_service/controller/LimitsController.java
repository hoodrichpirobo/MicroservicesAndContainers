package com.in28minutes.webservices.limits_service.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.in28minutes.webservices.limits_service.bean.*;
import com.in28minutes.webservices.limits_service.configuration.*;

@RestController
public class LimitsController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
	}
}
