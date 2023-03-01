package com.dynatheia.heset.Authentication.controller;

import com.dynatheia.heset.Authentication.service.UserService;
import com.dynatheia.heset.Authentication.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/v1/user")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String index() {
        return userService.getUsers().toString();
    }

    @PostMapping
    public String registerNewUser(@RequestBody User user){
        return userService.registerNewUser(user).get().toString();
    }
}
