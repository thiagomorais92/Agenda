package br.com.agenda.dao;

import javax.persistence.EntityManager;

import br.com.agenda.model.Usuario;

public class UsuarioDao extends DAO {
	
	public void salvar(Usuario usuario){
		EntityManager em = getEntityManager();
		try{
		em.getTransaction().begin();
		//em.persist(usuario);
		em.merge(usuario);
		em.getTransaction().commit();
		System.out.println("cadastrado com sucesso.");
		}catch(Exception e){
		em.getTransaction().rollback();	
			e.printStackTrace();
		}
	}
}
