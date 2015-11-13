/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logical.colissimos.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Yirou
 */
@Entity
@Table(name = "position")
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "latitude", nullable = true)
    private double latitude;
    @Column(name = "longitude", nullable = true)
    private double longitude;
    @Column(name = "emplacement", nullable = true, length = 255)
    private String emplacement;
    @ManyToOne(fetch = FetchType.LAZY)
    private Colis colis;
    @Column
    private String etat;
    @Column
    private Date dateAjout;

    public Position() {
    }

    public Position(double latitude, double longitude, String emplacement, Colis colis, String etat,Date dateAjout) {
        this.dateAjout=dateAjout;
        this.latitude = latitude;
        this.longitude = longitude;
        this.emplacement = emplacement;
        this.colis = colis;
        this.etat = etat;
    }

    public double getLatitude() {
        return latitude;
    }

    public Date getDate() {
        return dateAjout;
    }

    public void setDate(Date date) {
        this.dateAjout = date;
    }
    

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public Colis getColis() {
        return colis;
    }

    public void setColis(Colis colis) {
        this.colis = colis;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "com.logical.colissimo.model.Position[ id=" + id + " ]";
    }

}
