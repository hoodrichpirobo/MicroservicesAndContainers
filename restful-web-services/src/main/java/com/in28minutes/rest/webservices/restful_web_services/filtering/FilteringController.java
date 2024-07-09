package com.in28minutes.rest.webservices.restful_web_services.filtering;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.converter.json.*;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.*;
import java.util.*;

@RestController
public class FilteringController {
	
	SimpleBeanPropertyFilter filter = 
			SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
	
	FilterProvider filters =
			new SimpleFilterProvider().addFilter("SomeBean", filter);

	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		SomeBean someBean = new SomeBean("value1", "value2", "value3");
		
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
		
		mappingJacksonValue.setFilters(filters);
		
		return mappingJacksonValue;
	}
	
	@GetMapping("/filtering-list")
	public MappingJacksonValue filteringList() {
		List<SomeBean> list = Arrays.asList(new SomeBean("value1", "value2", "value3"),
				new SomeBean("value 4", "value5", "value6"));
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
		
		mappingJacksonValue.setFilters(filters);
		
		return mappingJacksonValue;
	}
}
