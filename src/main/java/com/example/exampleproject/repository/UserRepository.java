package com.example.exampleproject.repository;

import com.example.exampleproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
