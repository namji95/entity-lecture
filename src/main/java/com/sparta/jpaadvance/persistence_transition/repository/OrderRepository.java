package com.sparta.jpaadvance.persistence_transition.repository;

import com.sparta.jpaadvance.persistence_transition.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
