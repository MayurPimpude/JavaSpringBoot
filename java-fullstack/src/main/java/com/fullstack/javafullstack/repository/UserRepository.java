package com.fullstack.javafullstack.repository;

import com.fullstack.javafullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
