package br.com.casa.ferias.repository;

import br.com.casa.ferias.model.Usuario;
import java.util.List;

/**
 *
 * @author well
 */
public interface UsuarioRepository {

    /**
     *
     * @param usuario
     */
    public void save(Usuario usuario);

    public Usuario getById(Long id);

    public List<Usuario> findAll();

}
