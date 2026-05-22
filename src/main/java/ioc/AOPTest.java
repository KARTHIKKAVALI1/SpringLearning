package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AOPTest implements CommandLineRunner{
	
	@Autowired
	private Car car;
	
		public static void main(String[] args) {
			SpringApplication.run(AOPTest.class, args);
		}
	
		@Override
		public void run(String... args) throws Exception {
			car.drive();
		}
}
