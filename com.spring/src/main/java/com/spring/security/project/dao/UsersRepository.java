package com.spring.security.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.project.entite.Users;

public interface UsersRepository extends JpaRepository<Users, String>{

}
