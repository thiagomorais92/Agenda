package br.com.agenda.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	final static  EntityManagerFactory EMF = Persistence.createEntityManagerFactory("agenda");
	
	

	public EntityManager getEntityManager(){
		return EMF.createEntityManager();
	}
}
