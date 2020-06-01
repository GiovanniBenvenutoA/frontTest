package com.integration.Data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class JsonParseDataService implements JsonParseData {
	
	
	@Autowired
	private RestTemplate restTemplate;


	public Object parse(String url,Object object)
	{
		return restTemplate.getForObject(url, Object.class);
	}

}
