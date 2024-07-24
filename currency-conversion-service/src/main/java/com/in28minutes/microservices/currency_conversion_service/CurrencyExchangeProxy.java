package com.in28minutes.microservices.currency_conversion_service;

import org.springframework.cloud.openfeign.*;
import org.springframework.web.bind.annotation.*;

//@FeignClient(name="currency-exchange", url = "localhost:8000")
@FeignClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to);
}
