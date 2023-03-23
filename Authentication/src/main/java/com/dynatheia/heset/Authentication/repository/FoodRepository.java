package com.dynatheia.heset.Authentication.repository;

import com.dynatheia.heset.Authentication.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}

