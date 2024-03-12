package com.sparta.jpaadvance.orphanRemoval.repository;

import com.sparta.jpaadvance.orphanRemoval.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
