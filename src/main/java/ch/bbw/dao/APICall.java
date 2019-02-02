package ch.bbw.dao;

import ch.bbw.model.APIResponse;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class APICall{
    private String urlString;

    public APICall(String urlString) {
        super();
        this.urlString = urlString;
    }

    public APIResponse callAPi() {
        APIResponse response = new APIResponse();
        try {
            URL url = new URL(this.urlString);
            HttpURLConnection api = (HttpURLConnection) url.openConnection();

            api.setRequestMethod("GET");
            api.setRequestProperty("Content-Type", "application/json");
            api.setRequestProperty("User-Agent", "MyApplication 1.0.0");

            response.setStatusCode(api.getResponseCode());


            BufferedReader in;
            if (response.getStatusCode() == HttpURLConnection.HTTP_OK) {
                in = new BufferedReader(new InputStreamReader(api.getInputStream()));


                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine + "\n");
                }
                in.close();
                api.disconnect();
                response.setContent(content.toString());
            } else {
                //in = new BufferedReader(new InputStreamReader(api.getErrorStream()));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

}
