package ch.bbw.dao;

import ch.bbw.model.APIResponse;
import ch.bbw.model.Meme;
import com.google.gson.Gson;

import javax.ejb.Singleton;

@Singleton
public class DAOMeme {
    private APICall apiCall;

    public DAOMeme() {
        super();
        this.apiCall = new APICall("http://version1.api.memegenerator.net//Instances_Search?pageIndex=0&pageSize=1&apiKey=de7e7c1d-e81a-4526-a15d-cc5e7894d5d5&q=");
    }

    public Meme getMeme(String search) {
        APIResponse response = apiCall.callApi(search);
        Gson gson = new Gson();
        Meme meme = gson.fromJson(response.getContent(), Meme.class);
        return meme;
    }
}
