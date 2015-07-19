package br.com.casa.ferias.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author well
 * @param <T>
 * @param <PK>
 */
public class GenericDAO<T, PK> {

    private final Session session;

    public GenericDAO(Session session) {
        this.session = session;
    }

    public T getById(PK pk) {
        session.getTransaction().begin();
        Object o = session.load(getTypeClass(), (Serializable) pk);
        session.getTransaction().commit();
        return (T) o;
    }

    public void save(T entity) {
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
    }

    public void update(T entity) {
        session.getTransaction().begin();
        session.merge(entity);
        session.getTransaction().commit();
    }

    public void delete(T entity) {
        session.getTransaction().begin();
        session.delete(entity);
        session.getTransaction().commit();
    }

    public List<T> findAll() {
        session.getTransaction().begin();
        List<T> list = session.createQuery(("FROM " + getTypeClass().getName())).list();
        session.getTransaction().commit();
        return list;
    }

    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }

}
