package com.sparta.jpaadvance.many_to_one.repository;

import com.sparta.jpaadvance.many_to_one.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
