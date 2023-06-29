package com.pipay.profile.domain.event;

import com.google.gson.Gson;
import com.pipay.profile.domain.model.User;
import com.pipay.profile.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class UserRegisteredEventHandler {
    private Logger LOGGER = LoggerFactory.getLogger(UserRegisteredEventHandler.class);
    private static final Gson GSON = new Gson();
    private final UserRepository userRepository;

    private UserRegisteredEventHandler(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public void handlerUserRegistration(String userDetails){
        User user = GSON.fromJson(userDetails, User.class);
        LOGGER.info("user {} registered", user.getUsername());
        userRepository.save(user);
    }
}