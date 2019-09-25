package edu.mum.dao.imp;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.CredentialsDao;

import edu.mum.domain.Credentials;


@SuppressWarnings("unchecked")
@Repository
public class CredentialsDaoImp extends GenericDaoImp<Credentials> implements CredentialsDao {
	public CredentialsDaoImp() {
		super.setDaoType(Credentials.class);
	}
	
	public Credentials findByUserName(String username) {

		Query query = entityManager.createQuery("select m from CREDENTIALS m  where m.username =:username");
		return (Credentials) query.setParameter("username", username).getSingleResult();

	}
	

}
