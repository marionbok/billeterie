package com.epita.bean;
// Generated May 12, 2012 12:34:39 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="billeterie"
)
public class User  implements java.io.Serializable {


     private int userId;
     private String login;
     private String nom;
     private String prenom;
     private String adresse;
     private String cdp;
     private String ville;
     private String email;
     private boolean admin;

    public User() {
    }

	
    public User(int userId, String login, String nom, String prenom, boolean admin) {
        this.userId = userId;
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.admin = admin;
    }
    public User(int userId, String login, String nom, String prenom, String adresse, String cdp, String ville, String email, boolean admin) {
       this.userId = userId;
       this.login = login;
       this.nom = nom;
       this.prenom = prenom;
       this.adresse = adresse;
       this.cdp = cdp;
       this.ville = ville;
       this.email = email;
       this.admin = admin;
    }
   
     @Id 
    
    @Column(name="user_id", unique=true, nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    @Column(name="login", nullable=false, length=45)
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    @Column(name="nom", nullable=false, length=45)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    @Column(name="prenom", nullable=false, length=45)
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    @Column(name="adresse", length=45)
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    @Column(name="cdp", length=45)
    public String getCdp() {
        return this.cdp;
    }
    
    public void setCdp(String cdp) {
        this.cdp = cdp;
    }
    
    @Column(name="ville", length=45)
    public String getVille() {
        return this.ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }
    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="admin", nullable=false)
    public boolean isAdmin() {
        return this.admin;
    }
    
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }




}


