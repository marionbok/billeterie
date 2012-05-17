package com.epita.bean;
// Generated May 17, 2012 11:20:47 PM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CommamdeEtat generated by hbm2java
 */
@Entity
@Table(name = "COMMAMDE_ETAT", catalog = "Billeterie")
public class CommamdeEtat implements java.io.Serializable {

    private Integer commandeEtatId;
    private String libele;
    private Set commandes = new HashSet(0);

    public CommamdeEtat() {
    }

    public CommamdeEtat(String libele, Set commandes) {
        this.libele = libele;
        this.commandes = commandes;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "COMMANDE_ETAT_ID", unique = true, nullable = false)
    public Integer getCommandeEtatId() {
        return this.commandeEtatId;
    }

    public void setCommandeEtatId(Integer commandeEtatId) {
        this.commandeEtatId = commandeEtatId;
    }

    @Column(name = "libele", length = 45)
    public String getLibele() {
        return this.libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "commamdeEtat")
    public Set getCommandes() {
        return this.commandes;
    }

    public void setCommandes(Set commandes) {
        this.commandes = commandes;
    }
}
