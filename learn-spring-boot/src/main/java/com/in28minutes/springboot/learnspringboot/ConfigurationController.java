package com.in28minutes.springboot.learnspringboot;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConfigurationController {
	@Autowired
	private CurrencyServiceConfiguration configuration;

	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveallCourses(){
		return configuration;
	}
}
