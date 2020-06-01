package com.integration.Data;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.integration.Data.object.Indicator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Map;

@SpringBootApplication
public class DataApplication {


	public static void main(String[] args){
		SpringApplication.run(DataApplication.class, args);



	}

}
