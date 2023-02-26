package com.dynatheia.heset.Authentication.service;

import com.dynatheia.heset.Authentication.repository.UserRespository;
import com.dynatheia.heset.Authentication.user.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRespository userRespository){
        return args -> {
            User one = new User( "raph", "g", "hello@gmail.com", new Date().getSeconds());
            User two = new User( "aal", "m", "he@gmail.com", 14);
            userRespository.saveAll(List.of(one, two));
        };


    }


}
