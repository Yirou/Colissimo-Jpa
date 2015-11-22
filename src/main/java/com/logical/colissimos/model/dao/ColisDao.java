/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logical.colissimos.model.dao;

import com.logical.colissimos.model.Colis;
import com.logical.colissimos.model.dao.iDao.ColisDaoLocal;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author yirou
 */
@Stateful
public class ColisDao implements ColisDaoLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void add(Colis colis) {
        em.persist(colis);
    }

    @Override
    public void remove(Colis colis) {
        em.remove(colis);
    }

    @Override
    public void update(Colis colis) {
        em.merge(colis);
    }

    @Override
    public List<Colis> getAll() {
        return em.createQuery("SELECT c FROM Colis c", Colis.class).getResultList();
    }

    @Override
    public Colis getColis(int idColis) {
        return em.find(Colis.class, idColis);
    }

    @Override
    public List<Colis> chercherColis(String identifiant) {
        Query query=em.createQuery("SELECT c from Colis c WHERE c.identifiant=:id").setParameter("id",identifiant);
        return query.getResultList();
    }

}
