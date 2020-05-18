package com.navalprabhakar.training.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GcpMsRestHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpMsRestHelloworldApplication.class, args);
	}

	@GetMapping
	public String version() {
		return "np-trn-gcp-ms-rest-helloword-0.0.0-Snapshot";
	}
}
