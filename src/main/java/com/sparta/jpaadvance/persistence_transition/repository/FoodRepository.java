package com.sparta.jpaadvance.persistence_transition.repository;

import com.sparta.jpaadvance.persistence_transition.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
