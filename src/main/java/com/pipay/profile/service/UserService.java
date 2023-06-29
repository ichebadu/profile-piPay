package com.pipay.profile.service;

import com.pipay.profile.domain.model.User;
import com.pipay.profile.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public void newUser(User user) {
        user.setRegisteredSince(LocalDate.now().toString());
        userRepository.save(user);
    }

    public void updateUser(User user) {
        user.setRegisteredSince(LocalDate.now().toString());
        userRepository.save(user);
    }
}
