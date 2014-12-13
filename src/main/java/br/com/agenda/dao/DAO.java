package br.com.agenda.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	EntityManagerFactory emf;
	
	public DAO(){
		emf = Persistence.createEntityManagerFactory("agenda");
	}

	public EntityManager getEntityManager(){
		return emf.createEntityManager();
	}
}
