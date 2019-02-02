package ch.bbw.controll;

import ch.bbw.model.ChuckNorrisModel;
import ch.bbw.model.Meme;
import ch.bbw.model.Number;
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

    private int number;
    private int category;
    private String numberFact;
    private String searchText;
    private String memeLink = "./resources/meme.jpg";

    public String searchNumber() {
        Number n = service.getNumberFact(number, category);
        numberFact = n.getText();
        return "#";
    }

    public String getISSPositionLat() {
        return service.getISSPositionLat();
    }

    public String getISSPositionLong() {
        return service.getISSPositionLong();
    }

    public String getChuckNorrisJoke() {
        ChuckNorrisModel jnm = service.getChuckNorrisJoke();
        return jnm.getValue();
    }

    public String searchMeme() {
        Meme m = service.searchMeme(searchText);
        this.memeLink = m.getResult()[0].getInstanceImageUrl();
        return "#";
    }

    public String getMemeLink() {
        return memeLink;
    }

    public void setMemeLink(String memeLink) {
        this.memeLink = memeLink;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getNumberFact() {
        return numberFact;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
