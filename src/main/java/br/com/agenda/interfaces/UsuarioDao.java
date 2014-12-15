package br.com.agenda.interfaces;

import java.util.List;

import br.com.agenda.model.Usuario;

public interface UsuarioDao {

	  Usuario buscaPorId(Long id);
	  List<Usuario> lista();
	  void adiciona(Usuario t);
	  void altera(Usuario t);
	  void remove(Usuario t);
}
