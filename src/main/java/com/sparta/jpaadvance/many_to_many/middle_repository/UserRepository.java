package com.sparta.jpaadvance.many_to_many.middle_repository;

import com.sparta.jpaadvance.many_to_many.middle_entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
