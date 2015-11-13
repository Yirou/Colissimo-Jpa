/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logical.colissimos.model.dao.iDao;

import com.logical.colissimos.model.Colis;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author yirou
 */
@Local
public interface ColisDaoLocal {

    public void add(Colis colis);

    public void remove(Colis colis);

    public void update(Colis colis);

    public List<Colis> getAll();

    public Colis getColis(int idColis);

    public List<Colis> chercherColis(String identifiant);
}
