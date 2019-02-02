package ch.bbw.dao;

import ch.bbw.model.APIResponse;
import ch.bbw.model.JuckNorrisModel;
import com.google.gson.Gson;

public class DAOJuckNorris {
    private APICall apiCall;

    public DAOJuckNorris() {
        super();
        this.apiCall = new APICall("https://api.chucknorris.io/jokes/random");
    }

    public void getJoke() {
        APIResponse response = apiCall.callAPi();

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Content: " + response.getContent());

        Gson gson = new Gson();
        JuckNorrisModel jnModel = gson.fromJson(response.getContent(), JuckNorrisModel.class);
        System.out.println(jnModel.getValue());
    }
}
