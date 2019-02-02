package ch.bbw.dao;

import ch.bbw.model.Use;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Singleton
public class DAOUse {

    @PersistenceContext
    private EntityManager em;

    private Use getNewestUser() {
        TypedQuery<Use> tq = em.createQuery("SELECT u FROM Use u", Use.class);
        List<Use> list = tq.getResultList();
        Use use = list.get(0);
        for (Use u : list) {
            if (use.getTime().getTime() < u.getTime().getTime()) use = u;
        }
        return use;
    }
}
