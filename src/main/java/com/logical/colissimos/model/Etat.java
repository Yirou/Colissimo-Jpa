/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logical.colissimos.model;

/**
 *
 * @author Yirou
 */
public enum Etat {

    Enregistrement, Attente, Acheminement, Bloquer, Livrer;

    public Etat getEtat(String etat) {
        for (Etat e : Etat.values()) {
            if (e.toString().equalsIgnoreCase(etat)) {
                return e;
            }
        }
        return Etat.Enregistrement;
    }
}
