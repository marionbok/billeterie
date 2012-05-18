/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epita.dao;

import com.epita.bean.Film;
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
public class filmDao {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    public List<Film> getlistFilm() {
        List<Object> list = null;
        List<Film> result = null;

        Criteria criteria = session.createCriteria(Film.class);

        list = criteria.list();

        for (Object o : list) {
            result.add((Film) o);
        }
        return result;
    }

    public String saveFilm(Film film) {
        session.save(film);
        Criteria criteria = session.createCriteria(Film.class);
        return "OK";
    }
}
