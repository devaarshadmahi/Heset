package com.dynatheia.heset.Authentication.config;

import com.dynatheia.heset.Authentication.repository.UserRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRespository userRespository){
        return args -> {
//            User one = new User( "raph", "g", "hello@gmail.com","password",  new Date().getSeconds());
//            User two = new User( "aal", "m", "he@gmail.com","pass", 14);
//            userRespository.saveAll(List.of(one, two));
        };


    }


}
