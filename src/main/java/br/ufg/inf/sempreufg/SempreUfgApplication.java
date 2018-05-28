package br.ufg.inf.sempreufg;

import br.ufg.inf.sempreufg.entity.enums.ProfileEnum;
import br.ufg.inf.sempreufg.entity.model.User;
import br.ufg.inf.sempreufg.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SempreUfgApplication {

    public static void main(String[] args) {
        SpringApplication.run(SempreUfgApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            initUsers(userRepository, passwordEncoder);
        };
    }

    private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        User admin = new User();
        admin.setEmail("admin@sempreufg.com");
        admin.setPassword(passwordEncoder.encode("123456"));
        admin.setProfile(ProfileEnum.ROLE_ADMIN);

        User find = userRepository.findByEmail("admin@sempreufg.com");
        if (find == null) {
            userRepository.save(admin);
        }
    }
}
