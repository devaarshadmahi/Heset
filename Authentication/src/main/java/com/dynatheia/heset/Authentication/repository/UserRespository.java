package com.dynatheia.heset.Authentication.repository;

import com.dynatheia.heset.Authentication.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRespository extends JpaRepository<User,Long> {
    Optional<User> findUserByEmail(String email);
    Optional<User> findIdByEmail(String email);
 }
