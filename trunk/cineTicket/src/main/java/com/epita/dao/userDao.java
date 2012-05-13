/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epita.dao;

import com.epita.bean.User;
import com.epita.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author lindoox
 */
public class userDao {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    public User checkUser(String username, String password) {
        List<Object> result = null;

        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("login", username));
        criteria.add(Restrictions.eq("password", password));

        result = criteria.list();

        if (result != null && !result.isEmpty()) {
            return (User) result.get(0);
        } else {
            return null;
        }

    }
    
    public User createUser(User user){
        //TODO : creation user
        session.save(user);
        Criteria criteria = session.createCriteria(User.class);
        return user;
    }
}
