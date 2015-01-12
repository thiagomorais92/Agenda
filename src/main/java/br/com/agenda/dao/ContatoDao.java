package br.com.agenda.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.agenda.interfaces.GenericDao;
import br.com.agenda.model.Contato;
import br.com.agenda.model.Usuario;

@Repository
public class ContatoDao implements GenericDao<Contato> {

	@PersistenceContext
	EntityManager manager;
	
	
	

	@Override
	public void altera(Contato t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Contato t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscaPorId(Contato i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adiciona(Contato t) {
		System.out.println("aqui deveria salvar");
		manager.persist(t);
	}

}
