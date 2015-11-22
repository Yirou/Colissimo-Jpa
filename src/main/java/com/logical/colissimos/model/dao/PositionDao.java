/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logical.colissimos.model.dao;

import com.logical.colissimos.model.Position;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Yirou
 */
@Stateful
public class PositionDao implements PositionDaoLocal {
    
    @PersistenceContext
    EntityManager em;
    
    @Override
    public void add(Position position) {
        em.persist(position);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
