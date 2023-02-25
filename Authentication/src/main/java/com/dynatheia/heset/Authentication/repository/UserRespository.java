package com.dynatheia.heset.Authentication.repository;

import com.dynatheia.heset.Authentication.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User,Long> {
}
