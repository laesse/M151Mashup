package ch.bbw.controll;

import ch.bbw.service.ServiceController;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class ViewController implements Serializable {

    @EJB
    private ServiceController service;


}
