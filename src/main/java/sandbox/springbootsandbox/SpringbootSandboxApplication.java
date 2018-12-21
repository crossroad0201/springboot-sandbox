package sandbox.springbootsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootSandboxApplication {

	public static void main(String[] args) {
		System.out.println("Stating Spring application...");
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringbootSandboxApplication.class, args);
    	System.out.println(String.format("Started isActive=%s", appContext.isActive()));
	}

}
