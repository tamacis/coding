package com.cswl.outhexample;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableResourceServer
public class OuthExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OuthExampleApplication.class, args);
	}
}

@RestController
class MessageOfTheDayController {

	@GetMapping("/mod")
	public String getMessageOfTheDay(Principal principal) {

		return "The message of the day is boring for user: " + principal.getName();

	}

}
