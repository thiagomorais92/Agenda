package br.com.agenda.interfaces;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

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
	public List<Usuario> lista() {
		// TODO Auto-generated method stub
		return null;
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
