package com.sparta.jpaadvance.lazy_loading_immediate_loading.repository;

import com.sparta.jpaadvance.lazy_loading_immediate_loading.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
