package com.in28minutes.microservices.currency_exchange_service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.core.env.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private CurrencyExchangeRepository repository;
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to) {
		CurrencyExchange currencyExchange 
					= repository.findByFromAndTo(from, to);

		if(currencyExchange == null) {
			throw new RuntimeException
				("Unable to Find data for " + from + " to " + to);
		}
		
		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		
		return currencyExchange;
	}
}
