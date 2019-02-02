package ch.bbw.service;

import ch.bbw.dao.*;
import ch.bbw.model.ChuckNorrisModel;
import ch.bbw.model.Meme;
import ch.bbw.model.Number;

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
    DAOChuckNorris daoChuckNorris;

    @EJB
    DAOLog daoLog;


    public Number getNumberFact(int number, int category) {
        daoLog.addLog("[NumbersAPI] search number: " + number + " in category: " + category);
        return daoNumber.getFact(number, category);
    }

    public String getISSPositionLat() {
        daoLog.addLog("[ISSAPI] get Latitude");
        return daoiss.getPosition().getLatitude() + "";
    }

    public String getISSPositionLong() {
        daoLog.addLog("[ISSAPI] get Longitude");
        return daoiss.getPosition().getLongitude() + "";
    }

    public Meme searchMeme(String text) {
        text = text.replace(" ", "%20");
        daoLog.addLog("[MemeAPI] search for meme with search text: " + text);
        return daoMeme.getMeme(text);
    }

    public ChuckNorrisModel getChuckNorrisJoke() {
        daoLog.addLog("[ChuckNorrisAPI] get random Joke");
        return daoChuckNorris.getJoke();
    }
}
