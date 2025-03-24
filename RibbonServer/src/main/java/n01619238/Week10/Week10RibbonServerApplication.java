package n01619238.Week10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Week10RibbonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week10RibbonServerApplication.class, args);
	}

}
