package com.systemsinc.sdmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.systemsinc.sdmanager.controller") })
@EnableJpaRepositories("com.systemsinc.sdmanager.repository")
@EntityScan("com.systemsinc.sdmanager.model")
public class SdmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdmanagerApplication.class, args);
	}

}
