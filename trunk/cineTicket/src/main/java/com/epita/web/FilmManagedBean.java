/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epita.web;

import com.epita.bean.Film;
import com.epita.bean.Seances;
import com.epita.dao.filmDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author TiBs
 */
@ManagedBean (name="filmMB")
@ViewScoped
public class FilmManagedBean implements Serializable{
    

     private Film film;
     private List<Film> listfilm;
     private Seances seance;

    public Seances getSeance() {
        return seance;
    }

    public void setSeance(Seances seance) {
        this.seance = seance;
    }

    public List<Film> getListfilm() {
        return listfilm;
    }

    public void setListfilm(List<Film> listfilm) {
        this.listfilm = listfilm;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }


    /**
     * Creates a new instance of FilmManagedBean
     */
     
    
    
    public FilmManagedBean() {
        filmDao dao = new filmDao();
        
        listfilm = dao.getlistFilm();
    }

    public String SaveFilm() {
        
        return "OK";
    }
    
}
