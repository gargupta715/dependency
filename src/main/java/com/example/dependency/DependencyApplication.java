package com.example.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication {

	public static void main(String[] args) {
		System.out.println("In DependencyApplication");
		SpringApplication.run(DependencyApplication.class, args);
		System.out.println("Out DependencyApplication");
	}

}
