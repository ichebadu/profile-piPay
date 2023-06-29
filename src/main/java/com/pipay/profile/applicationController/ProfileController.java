package com.pipay.profile.applicationController;

import com.pipay.profile.domain.model.User;
import com.pipay.profile.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profile")
@RequiredArgsConstructor
public class ProfileController {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> findAllUsers(){
       return userService.findAllUsers();
    }

    @PostMapping("/users/addUser")
    public void newUser(@RequestBody final  User user){
        userService.newUser(user);
    }
    @PutMapping("/users/updateUser")
    public void updateUser(@RequestBody final User user){
        userService.updateUser(user);
    }
}