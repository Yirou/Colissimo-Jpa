/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logical.colissimos.model.dao;

import com.logical.colissimos.model.Position;
import javax.ejb.Local;

/**
 *
 * @author Yirou
 */
@Local
public interface PositionDaoLocal {
    public void add(Position position);
}
