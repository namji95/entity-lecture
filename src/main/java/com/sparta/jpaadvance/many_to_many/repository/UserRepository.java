package com.sparta.jpaadvance.many_to_many.repository;

import com.sparta.jpaadvance.many_to_many.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
