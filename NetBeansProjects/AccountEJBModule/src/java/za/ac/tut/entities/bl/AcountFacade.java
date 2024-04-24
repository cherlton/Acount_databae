/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.AcountClass;

/**
 *
 * @author Student
 */
@Stateless
public class AcountFacade extends AbstractFacade<AcountClass> implements AcountFacadeLocal {

    @PersistenceContext(unitName = "AccountEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AcountFacade() {
        super(AcountClass.class);
    }
    
}
