package br.com.agenda.interfaces;

import java.util.List;

import br.com.agenda.model.Usuario;

public interface GenericDao<T> {

		void adiciona(T t);
		Usuario buscaPorId(T i);
	  	List<T> listar();
	  	void altera(T t);
	  	void remove(T t);
}
