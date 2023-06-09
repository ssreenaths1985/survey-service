package com.tarento.formservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Darshan Nagesh
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FormService {
	public static void main(String[] args) {
		SpringApplication.run(FormService.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
