package com.dynatheia.heset.Authentication.service;

import com.dynatheia.heset.Authentication.repository.UserRespository;
import com.dynatheia.heset.Authentication.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRespository userRespository;

    @Autowired
    public UserService(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    public List<User> getUsers(){
        return userRespository.findAll();
    }
    public Optional<User> registerNewUser(User user){
        Optional<User> userOptional = userRespository
                .findUserByEmail(user.getEmail());
        if (userOptional.isPresent()){
            throw new IllegalStateException("Email Already Exists");
        }
        userRespository.save(user);
        return userRespository.findIdByEmail(user.getEmail());
    }
}
