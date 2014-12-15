package br.com.agenda.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transaction;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import br.com.agenda.model.Usuario;


public class UsuarioDao extends DAO {
	
	public void salvar(Usuario usuario){
		EntityManager em = this.getEntityManager();
		
		System.out.println("tentando salvar: "+usuario.getNome());
		try{
			System.out.println("cadastrando");
		em.getTransaction().begin();
		
		System.out.println("beginned");
		em.persist(usuario);
		System.out.println(usuario.getNome());
		em.getTransaction().commit();
		System.out.println("cadastrado com sucesso.");
		
		}catch(Exception e){
		em.getTransaction().rollback();	
			e.printStackTrace();
		}
	}
}
