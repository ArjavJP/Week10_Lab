package n01619238.week10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Week10RibbonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week10RibbonEurekaServerApplication.class, args);
	}

}
