package br.com.casa.ferias.repository;

import br.com.casa.ferias.model.Usuario;
import java.util.List;

/**
 *
 * @author well
 */
public interface UsuarioRepository {

    void salva(Usuario usuario);

    Usuario buscar(Long id);

    List<Usuario> buscarTodos();

}
