package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.Credentials;
import edu.mum.service.CredentialsService;

@RestController
@RequestMapping("/credentials")
public class CredentialsController {
	@Autowired
	CredentialsService credentialsService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Credentials> getAll() {
		return credentialsService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Credentials findOne(@PathVariable("id") Long id) {
		Credentials credentials=credentialsService.findOne(id);
		return credentials;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable Long id, @RequestBody Credentials credentials) {
		Credentials cred = credentialsService.findOne(id);
	    if (cred != null) {
	        cred.setAuthority(credentials.getAuthority());
	        cred.setEnabled(credentials.getEnabled());
	        cred.setPassword(credentials.getPassword());
	        cred.setTeamMember(credentials.getTeamMember());
	        cred.setUsername(credentials.getUsername());
	        cred.setVerifyPassword(credentials.getVerifyPassword());
	    } else {
	        credentialsService.save(credentials);
	        System.out.println("Credentials successfully edited!");
	    }
	}

//	@RequestMapping(value = "/add", method = RequestMethod.POST)
//	@ResponseStatus(value = HttpStatus.NO_CONTENT)
//	public void processAddNewProductForm(@RequestBody Credentials credentials ) {
//			System.out.println("==========coming======================");
//			
//			
//			
//			credentialsService.save(credentials);
//			
//			
//			System.out.println("Credential successfully added!");
//	}
	
}
