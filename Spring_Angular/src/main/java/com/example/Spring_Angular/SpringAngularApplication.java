package com.example.Spring_Angular;

import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Domain.Tasks;
import Service.TaskService;

@SpringBootApplication
public class SpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApplication.class, args);
		
	}
	
	@Bean
	CommandLineRunner  runner(TaskService taskservice ) {
		return args  ->{
			taskservice.save (  new Tasks( id: 1L, name: "crate jaa",  LocalDate.now( ), completed: true ) );*/
			
		
		};
		}
}
