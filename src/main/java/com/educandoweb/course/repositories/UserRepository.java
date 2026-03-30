package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

// ACESSA O BANCO:

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
