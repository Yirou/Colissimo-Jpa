/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logical.colissimos.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Yirou
 */
@Entity
@Table(name = "colis")
public class Colis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "poids", nullable = true, length = 255)
    private float poids;
    @Column(name = "valeur", nullable = true, length = 15)
    private double valeur;
    @Column(name = "origine", nullable = true, length = 15)
    private String origine;
    @Column(name = "destination", nullable = true, length = 255)
    private String destination;
    @Column(name = "identifiant", nullable = true, length = 255)
    private String identifiant;
    @Column(name = "date_ajout")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateAjoute;
    @OneToMany(mappedBy = "colis", cascade = CascadeType.ALL)
    List<Position> mesPositions = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Colis(String identifiant, float poids, double valeur, String origine, String destination, Date dateAjoute, List<Position> mesPositions) {
        this.identifiant = identifiant;
        this.poids = poids;
        this.valeur = valeur;
        this.origine = origine;
        this.destination = destination;
        this.dateAjoute = dateAjoute;
        this.mesPositions = mesPositions;
    }

    public Date getDateAjoute() {
        return dateAjoute;
    }

    public void setDateAjoute(Date dateAjoute) {
        this.dateAjoute = dateAjoute;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Position> getMesPositions() {
        return mesPositions;
    }

    public void setMesPositions(List<Position> mesPositions) {
        this.mesPositions = mesPositions;
    }

    public Colis() {
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "com.logical.colissimo.model.Colis[ id=" + id + " ]";
    }

}
