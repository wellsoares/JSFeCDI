package br.com.casa.ferias.dao;

import br.com.casa.ferias.model.Usuario;
import br.com.casa.ferias.repository.UsuarioRepository;
import org.hibernate.Session;

/**
 *
 * @author well
 */
public class UsuarioDao extends GenericDAO<Usuario, Integer> implements UsuarioRepository {

    public UsuarioDao(Session session) {
        super(session);
    }

    @Override
    public Usuario getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
