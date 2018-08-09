package agronomych.bell;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@SpringBootApplication
@ComponentScan("agronomych.*")
//@EnableJpaRepositories
public class BellApplication {

	public static void main(String[] args) {
		SpringApplication.run(BellApplication.class, args);
	}


	/*@Bean
	public EntityManager entityManager () {
		return
	}*/
	/*@Bean
	public EntityManager entityManager(){
		return Persistence.createEntityManagerFactory("usinghibernate").createEntityManager();
	}*/
	@PersistenceContext
	public EntityManagerFactory entityManagerFactory(){
		return Persistence.createEntityManagerFactory("");
	}
	;

	/*@Bean
	@Qualifier(value = "entityManager")
	public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
		return entityManagerFactory.createEntityManager();
	}*/

}