package br.com.casa.ferias.main;

import br.com.casa.ferias.conf.HibernateUtil;
import br.com.casa.ferias.dao.UsuarioDao;
import br.com.casa.ferias.model.Usuario;
import br.com.casa.ferias.repository.UsuarioRepository;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;

/**
 *
 * @author well
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//
//        Query hql = session.createQuery("FROM Usuario");
//
//        List<Usuario> usuarios = hql.list();
//
//        session.getTransaction().commit();
//
//        System.out.println(usuarios);

        UsuarioRepository usersRepository = new UsuarioDao(HibernateUtil.getSessionFactory().getCurrentSession());
        

        System.out.println(usersRepository.findAll());

        System.out.println("TERMINOU");
    }
}
