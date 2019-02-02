package ch.bbw.dao;

import ch.bbw.model.APIResponse;
import ch.bbw.model.ChuckNorrisModel;
import com.google.gson.Gson;

import javax.ejb.Singleton;

@Singleton
public class DAOChuckNorris {
    private APICall apiCall;

    public DAOChuckNorris() {
        super();
        this.apiCall = new APICall("https://api.chucknorris.io/jokes/random");
    }

    public ChuckNorrisModel getJoke() {
        APIResponse response = apiCall.callApi();

        Gson gson = new Gson();
        ChuckNorrisModel jnModel = gson.fromJson(response.getContent(), ChuckNorrisModel.class);
        return jnModel;
    }
}
