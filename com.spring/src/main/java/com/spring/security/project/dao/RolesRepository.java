package com.spring.security.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.project.entite.Roles;

public interface RolesRepository extends JpaRepository<Roles, String> {

}
