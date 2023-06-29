package com.pipay.profile;

import com.pipay.profile.domain.model.User;
import com.pipay.profile.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
public class ProfileApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProfileApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("ichebadu","ichebadu", "chukwu", 25,"software enginner", LocalDate.now().toString()));
        userRepository.save(new User("iche","iche", "kwu", 35,"software ", LocalDate.now().toString()));
        userRepository.save(new User("badu","badu", "chu", 45,"enginner", LocalDate.now().toString()));
    }
}
