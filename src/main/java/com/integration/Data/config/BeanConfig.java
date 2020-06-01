package com.integration.Data.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;



@Configuration
public class BeanConfig {
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add("user-agent", "Application");
			return execution.execute(request, body);
		};
		return restTemplateBuilder.additionalInterceptors(interceptor).build();
	}
	
	
	

}
