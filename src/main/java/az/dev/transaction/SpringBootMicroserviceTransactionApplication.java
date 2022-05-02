package az.dev.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.yml")
public class SpringBootMicroserviceTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceTransactionApplication.class, args);
	}

}
