/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epita.dao;

import com.epita.bean.Film;
import com.epita.bean.Seances;
import com.epita.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author TiBs
 */
public class seanceDao {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    public List<Seances> getseanceFilm(Film film) {
        List<Object> list = null;
        List<Seances> result = null;

        Criteria criteria = session.createCriteria(Seances.class);
        criteria.add(Restrictions.eq("filmId", film.getFilmId()));

        list = criteria.list();

        for (Object o : list) {
            result.add((Seances) o);
        }
        return result;
    }

    public String saveSeance(Seances seance) {
        session.save(seance);
        Criteria criteria = session.createCriteria(Seances.class);
        return "OK";
    }
}
