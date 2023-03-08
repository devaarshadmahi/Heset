package com.dynatheia.heset.Authentication.repository;

import com.dynatheia.heset.Authentication.models.Ingredient;
import com.dynatheia.heset.Authentication.models.User;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
//    Optional<Ingredient> findIngredientByUserId(Long id);
}
