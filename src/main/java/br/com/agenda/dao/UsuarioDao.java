package br.com.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.agenda.interfaces.GenericDao;
import br.com.agenda.model.Usuario;

@Repository
public class UsuarioDao implements GenericDao<Usuario> {

	@PersistenceContext
	EntityManager manager;

	@Override
	public Usuario buscaPorId(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listar() {

		Query query = manager.createQuery("select u from Usuario u");
		List<Usuario> lista = query.getResultList();
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

	public Usuario logarUsuario(Usuario t) {
		Usuario user = null;
		Query query = manager
				.createQuery("from Usuario  as u where u.email = :email and u.senha = :senha");
		query.setParameter("email", t.getEmail());
		query.setParameter("senha", t.getSenha());

		List<Usuario> lista = query.getResultList();

		if (lista.isEmpty()) {
			return user;
		}
		user = lista.get(0);
		return user;
		}

}
