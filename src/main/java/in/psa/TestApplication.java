package in.psa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		char x='a';
		float m=10.3f;
		SpringApplication.run(TestApplication.class, args);
	}

}
