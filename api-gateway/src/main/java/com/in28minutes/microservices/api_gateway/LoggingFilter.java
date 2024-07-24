package com.in28minutes.microservices.api_gateway;

import org.slf4j.*;
import org.springframework.cloud.gateway.filter.*;
import org.springframework.stereotype.*;
import org.springframework.web.server.*;
import reactor.core.publisher.*;

@Component
public class LoggingFilter implements GlobalFilter{
	private Logger logger = LoggerFactory.getLogger(LoggingFilter.class);
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("Path of the request received -> {}",
				exchange.getRequest().getPath());
		return chain.filter(exchange);
	}

}
