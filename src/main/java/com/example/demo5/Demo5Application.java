package com.example.demo5;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.example.demo5.config.Demo5Config;
import com.example.demo5.entity.Country;
import com.example.demo5.service.CountryService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Import(Demo5Config.class)
public class Demo5Application {

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo5Application.class, args);
		Demo5Application application = context.getBean(Demo5Application.class);
		application.start();
		context.close();
	}

	private void start() {
		Country country = countryService.getByCode("FR");
		log.info("-> {}", country);
	}

	@PostConstruct
	private void init() {
		countryService.saveFromCsv("src/main/resources/countries.csv");
	}
}
