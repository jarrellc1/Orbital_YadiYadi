package com.yadiyadi.yadiyadi.repository;

import com.yadiyadi.yadiyadi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
