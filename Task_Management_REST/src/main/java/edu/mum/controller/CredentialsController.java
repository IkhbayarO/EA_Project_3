package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.Credentials;
import edu.mum.service.CredentialsService;

@RestController
@RequestMapping("/credentials")
public class CredentialsController {
	@Autowired
	CredentialsService credentialsService;
	@RequestMapping(value = "", method =RequestMethod.GET)
	public List<Credentials> getAll(){
		return credentialsService.findAll();
	}
}
