package com.dynatheia.heset.Authentication.controller;

import com.dynatheia.heset.Authentication.service.UserService;
import com.dynatheia.heset.Authentication.user.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/user")
public class UserController {

    UserService userService;
    @GetMapping()
    public String index() {
        return userService.getUsers().toString();
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user){
        userService.registerNewUser(user);
    }


}
