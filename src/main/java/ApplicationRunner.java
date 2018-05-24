import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.norsys.pamela")
public class ApplicationRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationRunner.class);

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunner.class);
	}

}
