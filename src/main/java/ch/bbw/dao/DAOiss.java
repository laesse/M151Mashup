package ch.bbw.dao;

import ch.bbw.model.APIResponse;
import ch.bbw.model.ISSModel;
import com.google.gson.Gson;

import javax.ejb.Singleton;

@Singleton
public class DAOiss {

	private APICall apiCall;
	private ISSModel issModel = null;

	public DAOiss() {
		super();
		this.apiCall = new APICall("http://api.open-notify.org/iss-now.json");
	}

	public ISSModel getPosition(){
		APIResponse response = apiCall.callApi();

		this.issModel = new Gson().fromJson(response.getContent(), ISSModel.class);
		return this.issModel;
	}

}
