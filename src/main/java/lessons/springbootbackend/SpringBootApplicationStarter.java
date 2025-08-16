package lessons.springbootbackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = "lessons.springbootbackend"
)
public class SpringBootApplicationStarter {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootApplicationStarter.class);
        app.run(args);
        Logger logger = LoggerFactory.getLogger(SpringBootApplicationStarter.class);
        logger.info("= SPRING BOOT APPLICATION SERVER STARTED =======================================");
    }
}
