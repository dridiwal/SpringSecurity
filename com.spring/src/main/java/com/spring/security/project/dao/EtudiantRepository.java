package com.spring.security.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.project.entite.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>  {

}
