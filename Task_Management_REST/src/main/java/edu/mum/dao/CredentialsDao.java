package edu.mum.dao;

import java.util.List;

import edu.mum.domain.Credentials;


public interface CredentialsDao extends GenericDao<Credentials> {
	
	public Credentials findByUserName(String userName);

}
