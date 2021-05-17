package com.tvapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TvAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TvAppApplication.class, args);
	}
	
	@Bean
	RestTemplate getInstance() {
		return new RestTemplate();
	}

}
