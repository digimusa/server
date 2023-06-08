package com.bongumusa.server;

import com.bongumusa.server.enumeration.Status;
import com.bongumusa.server.model.Server;
import com.bongumusa.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.bongumusa.server.enumeration.Status.*;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServerApplication.class, args);
	}

	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.168", "Ubuntu Linux", "16 GB", "Personal PC", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.58", "Fedora Linux", "16 GB", "Dell Tower", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.21", "MS 2008", "32 GB", "Web Server", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.14", "Red Hat Enterprise Linux", "64 GB", "Mail Server", SERVER_UP));
		};
	}

}
