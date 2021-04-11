package fc.security.oauth2.resource1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Resource1Application {
    public static void main(String[] args) {
        SpringApplication.run(Resource1Application.class, args);
    }
}
