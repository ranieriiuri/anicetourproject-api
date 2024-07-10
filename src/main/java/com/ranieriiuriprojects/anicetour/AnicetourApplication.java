package com.ranieriiuriprojects.anicetour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class AnicetourApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnicetourApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void onApplicationReady() {
		System.out.println("\nRanieri's A nice tour API is running on \u2615");
	}

}
