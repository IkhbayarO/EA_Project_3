package edu.mum.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.aspect.annotation.Logging;
import edu.mum.dao.CredentialsDao;
import edu.mum.domain.Credentials;
import edu.mum.service.CredentialsService;

@Service
@Transactional 
public class CredentialsServiceImp implements CredentialsService {
	
	@Autowired
	private CredentialsDao credentialsDao;
	@Logging
	@Override
	public void save(Credentials credentials) {
		credentialsDao.save(credentials);
	}
	@Logging
	@Override
	public List<Credentials> findAll() {
		return (List<Credentials>)credentialsDao.findAll();
	}
	@Logging
	@Override
	public void update(Credentials credentials) {
		credentialsDao.update(credentials);
		
	}
	@Logging
	@Override
	public Credentials findOne(Long id) {
		return credentialsDao.findOne(id);
	}
	@Logging
	@Override
	public Credentials findByUserName(String userName) {
		return credentialsDao.findByUserName(userName);
	}


}
