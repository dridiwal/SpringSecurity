package com.spring.security.project.service;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.project.dao.EtudiantRepository;
import com.spring.security.project.entite.Etudiant;

@RestController
public class EtudiantResService {

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@RequestMapping(value="/ajouterEtudiant", method=RequestMethod.POST)
	@Secured(value={"ROLE_ADMIN","ROLE_PROF"})
	public Object ajouterEtudiant(@RequestBody @Valid Etudiant etudiant, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
		Map<String, Object> errors=new HashMap<>();
		errors.put("errors", true);
		for(FieldError fe: bindingResult.getFieldErrors()){
			errors.put(fe.getField(), fe.getDefaultMessage());
			}
			return errors;
		}
		return etudiantRepository.save(etudiant);
	}
	@Secured(value={"ROLE_ADMIN","ROLE_PROF","ROLE_ETUDIANT","ROLE_SCOLARITER"})
	@RequestMapping(value="/listEtudiants")
	public Page<Etudiant> listEtudiants(int page, int size){
		return etudiantRepository.findAll(new PageRequest(page, size));
	}
}
