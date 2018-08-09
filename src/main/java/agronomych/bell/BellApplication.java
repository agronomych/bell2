package agronomych.bell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@SpringBootApplication
/*@ComponentScan("agronomych.bell.*")
@EnableJpaRepositories*/
public class BellApplication {

	public static void main(String[] args) {
		SpringApplication.run(BellApplication.class, args);
	}

	/*@Bean
	public EntityManager entityManager () {
		return Persistence.createEntityManagerFactory("org.hibernate").createEntityManager();
	}*/
}