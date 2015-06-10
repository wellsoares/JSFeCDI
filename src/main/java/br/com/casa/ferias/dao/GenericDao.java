/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.casa.ferias.dao;

import br.com.casa.ferias.conf.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author well
 */
public class GenericDao<T> {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    
    
    

}
