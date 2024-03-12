package com.sparta.jpaadvance.orphanRemoval.repository;

import com.sparta.jpaadvance.orphanRemoval.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByName(String robbie);
}
