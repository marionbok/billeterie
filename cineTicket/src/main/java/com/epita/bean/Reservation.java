package com.epita.bean;
// Generated May 17, 2012 11:20:47 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Reservation generated by hbm2java
 */
@Entity
@Table(name="RESERVATION"
    ,catalog="Billeterie"
)
public class Reservation  implements java.io.Serializable {


     private Integer reservationId;
     private User user;
     private Commande commande;
     private Seances seances;

    public Reservation() {
    }

    public Reservation(User user, Commande commande, Seances seances) {
       this.user = user;
       this.commande = commande;
       this.seances = seances;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="reservation_id", unique=true, nullable=false)
    public Integer getReservationId() {
        return this.reservationId;
    }
    
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="commande_id", nullable=false)
    public Commande getCommande() {
        return this.commande;
    }
    
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Seance_id", nullable=false)
    public Seances getSeances() {
        return this.seances;
    }
    
    public void setSeances(Seances seances) {
        this.seances = seances;
    }




}

