package com.github.MemberRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MemberRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberRestApiApplication.class, args);
	}

}
