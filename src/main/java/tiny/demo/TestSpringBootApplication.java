package tiny.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class TestSpringBootApplication {

    public static void main(final String[] args) {
        SpringApplication.run(TestSpringBootApplication.class, args);
    }

}
