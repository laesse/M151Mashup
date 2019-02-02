package ch.bbw.service;

import ch.bbw.dao.DAOJuckNorris;
import ch.bbw.dao.DAOMeme;
import ch.bbw.dao.DAONumber;
import ch.bbw.dao.DAOiss;

import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful
public class ServiceController {

    @EJB
    DAONumber daoNumber;

    @EJB
    DAOMeme daoMeme;

    @EJB
    DAOiss daoiss;

    @EJB
    DAOJuckNorris daoJuckNorris;


}
