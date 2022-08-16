package com.banvien.springbootdockerpostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootDockerPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerPostgresApplication.class, args);
	}

}
