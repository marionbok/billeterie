/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epita.dao;

import com.epita.bean.Commande;
import com.epita.bean.Seances;
import com.epita.bean.User;
import com.epita.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author TiBs
 */
public class commandeDao {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    public List<Commande> getCommande(User user) {
        List<Object> list = null;
        List<Commande> result = null;

        Criteria criteria = session.createCriteria(Commande.class);
        criteria.add(Restrictions.eq("userId", user.getUserId()));

        list = criteria.list();

        for (Object o : list) {
            result.add((Commande) o);
        }
        return result;
    }
    
    public List<Commande> getReservatio(User user) {
        List<Object> list = null;
        List<Commande> result = null;

        Criteria criteria = session.createCriteria(Commande.class);
        criteria.add(Restrictions.eq("userId", user.getUserId()));

        list = criteria.list();

        for (Object o : list) {
            result.add((Commande) o);
        }
        return result;
    }
    
}
