package com.dynatheia.heset.Authentication.service;

import com.dynatheia.heset.Authentication.repository.UserRespository;
import com.dynatheia.heset.Authentication.user.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    private final UserRespository userRespository;

    @Autowired
    public UserService(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    public List<User> getUsers(){
        return userRespository.findAll();
    }
}
