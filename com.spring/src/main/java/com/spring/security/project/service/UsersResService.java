package com.spring.security.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.project.dao.RolesRepository;
import com.spring.security.project.dao.UsersRepository;
import com.spring.security.project.entite.Roles;
import com.spring.security.project.entite.Users;

@RestController
@Secured(value={"ROLE_ADMIN"})
public class UsersResService {

	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private RolesRepository rolesRepository;
	
	@RequestMapping(value="/ajouterUser")
	public Users ajouterUser(Users user){
		return usersRepository.save(user);
	}
	@RequestMapping(value="/listUsers")
	public List<Users> listUsers(){
		return usersRepository.findAll();
	}
	@RequestMapping(value="/ajouterRole")
	public Roles ajouterRole(Roles role){
		return rolesRepository.save(role);
	}
	@RequestMapping(value="/listRoles")
	public List<Roles> listRoles(){
		return rolesRepository.findAll();
	}
	@RequestMapping(value="/ajouterRolestoUser")
	public Users ajouterRolesToUser(String username,String role){
		Users user= usersRepository.findOne(username);
		Roles roles=rolesRepository.findOne(role);
		user.getRoles().add(roles);
		usersRepository.save(user);
		return user;
	}
}
