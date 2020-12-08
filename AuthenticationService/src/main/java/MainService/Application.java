package MainService;

import MainService.domain.User;
import MainService.respository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 * @author : wqruan
 * @version : 1.0.0
 * @date : 2020/10/27 13:50
 */
@SpringBootApplication
@EnableEurekaClient
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * This is a function to create some basic entities when the application starts.
     * Now we are using a In-Memory database, so you need it.
     * You can change it as you like.
     */
    @Bean
    public CommandLineRunner dataLoader(UserRepository userRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // Create authorities if not exist.

                // Create an admin if not exists.
                if (userRepository.findByUsername("admin") == null) {
                    User admin = new User(
                            "admin",
                            "ErangelManager",
                            BCrypt.hashpw("Erangel", BCrypt.gensalt()),
                            "libowen@fudan.edu.cn",
                            "Fudan University",
                            "ShangHai China"
                    );
                    userRepository.save(admin);
                }

            }


        };
    }
}