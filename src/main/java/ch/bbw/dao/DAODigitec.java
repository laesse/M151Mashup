package ch.bbw.dao;

import ch.bbw.model.APIResponse;

public class DAODigitec {
    private APICall apiCall;

    public DAODigitec(String searchItem) {
        super();
        this.apiCall = new APICall("https://www.digitec.ch/SearchModule/api/v1/Search/incrementaldynamic?suggestText="+searchItem+"&portalId=25&size=2000&onlyActive=true&showInList=true&languageId=1");
    }

    public void search(){
        APIResponse response = apiCall.callAPi();

        System.out.println("Status Code: "+response.getStatusCode());
        System.out.println("Content: "+response.getContent());


        //this.issModel = new Gson().fromJson(response.getContent(),ISSModel.class);

    }

}
