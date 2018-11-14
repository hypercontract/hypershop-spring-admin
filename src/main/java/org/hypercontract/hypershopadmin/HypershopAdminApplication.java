package org.hypercontract.hypershopadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class HypershopAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(HypershopAdminApplication.class, args);
	}
}
