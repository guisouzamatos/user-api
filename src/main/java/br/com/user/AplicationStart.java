package br.com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
public class AplicationStart {
	public static void main(String[] args) {
		SpringApplication.run(AplicationStart.class, args);
	}
}
