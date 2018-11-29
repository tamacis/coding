package com.cswl.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
        
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
            return app.sources(SpringbootdemoApplication.class);
        }
}
