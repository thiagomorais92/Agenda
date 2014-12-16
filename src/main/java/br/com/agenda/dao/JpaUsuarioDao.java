package br.com.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		// TODO Auto-generated method stub
		
	}

	
}
