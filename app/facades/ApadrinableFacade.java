/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Apadrinable;


@Stateless
public class ApadrinableFacade extends AbstractFacade<Apadrinable> {

    @PersistenceContext(unitName = "EJBModule2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApadrinableFacade() {
        super(Apadrinable.class);
    }
    
}
