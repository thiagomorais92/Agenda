package br.com.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;


import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.agenda.interfaces.UsuarioDao;
import br.com.agenda.model.Usuario;


@Repository
public class JpaUsuarioDao implements UsuarioDao {

	@PersistenceContext
	EntityManager manager;
	
	@Override
	public Usuario buscaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listar() {
		List<Usuario> lista = manager.createQuery("select t from usuario as t where t.id <99").getResultList();
		return lista;
	}

	@Override
	public void adiciona(Usuario t) {
		manager.persist(t);
		
	}

	@Override
	public void altera(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Usuario t) {
		manager.remove(t);
		
	}

	@Override
	public boolean logarUsuario(Usuario t) {
		Usuario user = new Usuario();
		Query query =  manager.createQuery("from Usuario  as u where u.email = :email and u.senha = :senha");
		query.setParameter("email", t.getEmail());
		query.setParameter("senha", t.getSenha());
		try{
		user = (Usuario) query.getSingleResult();
		return true;
		}catch(NoResultException e ){
			return false;
		}
		
	}

	
}
