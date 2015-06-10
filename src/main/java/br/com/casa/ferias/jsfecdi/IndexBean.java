package br.com.casa.ferias.jsfecdi;

import br.com.casa.ferias.conf.HibernateUtil;
import br.com.casa.ferias.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author well
 */
@Named()
//@ManagedBean(name = "indexBean")
@RequestScoped
public class IndexBean implements Serializable {

    @PostConstruct
    public void init() {
        System.out.println("CONSTRUIU REQUEST !!!");
    }

    public void requestMethod() {
        System.out.println("CHAMOU !!!!");

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Query hql = session.createQuery("FROM Usuario");

        List<Usuario> usuarios = hql.list();

        session.getTransaction().commit();

        System.out.println(usuarios);
    }

}
