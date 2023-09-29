package com.sinensia.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Sergio
 * @see com.sinensia.model.BookCopy
 * @see com.sinensia.service.BookCopyServiceImpl
 * @see com.sinensia.service.BookCopyService
 */
@SpringBootApplication(scanBasePackages = { "com.sinensia.controller", "com.sinensia.service" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * Configuramos la clase RestTemplate con la anotacion @Bean para utilizarla en
	 * nuestro BookCopyServiceImpl
	 * 
	 * @return
	 */
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

}
