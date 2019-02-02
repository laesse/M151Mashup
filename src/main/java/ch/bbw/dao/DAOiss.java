package ch.bbw.dao;

import ch.bbw.model.APIResponse;
import ch.bbw.model.ISSModel;
import com.google.gson.Gson;

public class DAOiss {

	private APICall apiCall;
	private ISSModel issModel = null;

	public DAOiss() {
		super();
		this.apiCall = new APICall("http://api.open-notify.org/iss-now.json");
    }
	public ISSModel getPosition(){
		APIResponse response = apiCall.callAPi();

		System.out.println("Status Code: "+response.getStatusCode());
		System.out.println("Content: "+response.getContent());

        this.issModel = new Gson().fromJson(response.getContent(),ISSModel.class);
		return this.issModel;
	}

	public ISSModel getIssModel() {
		return this.getPosition();
	}
}
