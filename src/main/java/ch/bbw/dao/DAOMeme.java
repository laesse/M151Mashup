package ch.bbw.dao;

import ch.bbw.model.APIResponse;
import ch.bbw.model.Meme;
import com.google.gson.Gson;

public class DAOMeme {
    private APICall apiCall;

    public DAOMeme(String search) {
        super();
        this.apiCall = new APICall("http://version1.api.memegenerator.net//Instances_Search?q=" + search + "&pageIndex=0&pageSize=1&apiKey=de7e7c1d-e81a-4526-a15d-cc5e7894d5d5");
    }

    public void getMeme() {
        APIResponse response = apiCall.callAPi();

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Content: " + response.getContent());

        Gson gson = new Gson();
        Meme meme = gson.fromJson(response.getContent(), Meme.class);
        System.out.println(meme.getResult()[0].getInstanceImageUrl());
    }
}
