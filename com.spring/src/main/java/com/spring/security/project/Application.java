package com.spring.security.project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.security.project.dao.EtudiantRepository;
import com.spring.security.project.dao.RolesRepository;
import com.spring.security.project.dao.UsersRepository;
import com.spring.security.project.entite.Etudiant;
import com.spring.security.project.entite.Roles;
import com.spring.security.project.entite.Users;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ParseException {
	 ApplicationContext ctx=SpringApplication.run(Application.class, args);
	/* 
	 EtudiantRepository etudiantRepository= ctx.getBean(EtudiantRepository.class);
	 UsersRepository usersRepository =ctx.getBean(UsersRepository.class);
	 RolesRepository rolesRepository =ctx.getBean(RolesRepository.class);
	 
	 DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
	 etudiantRepository.save(new Etudiant("walid", "Dridi", df.parse("23/11/1987")));
	 etudiantRepository.save(new Etudiant("Mohamed", "Dridi", df.parse("23/11/1966")));
	 etudiantRepository.save(new Etudiant("Halim", "Dridi", df.parse("23/11/1975")));
	 etudiantRepository.save(new Etudiant("Nabli", "Dridi", df.parse("23/11/1985")));
	**/

	 
	}
}
