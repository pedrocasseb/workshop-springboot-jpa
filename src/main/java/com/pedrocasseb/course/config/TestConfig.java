package com.pedrocasseb.course.config;

import com.pedrocasseb.course.entities.User;
import com.pedrocasseb.course.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class TestConfig implements CommandLineRunner {
    private final UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888888", "123456", null);
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "8999999999", "123456", null);
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
