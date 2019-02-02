package ch.bbw.dao;

import ch.bbw.model.Log;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class DAOLog {

    @PersistenceContext
    private EntityManager em;

    public void addLog(String usecase) {
        Log log = new Log();
        log.setUsecase(usecase);
        em.merge(log);
    }
}
