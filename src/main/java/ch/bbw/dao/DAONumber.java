package ch.bbw.dao;

import ch.bbw.model.APIResponse;
import ch.bbw.model.Number;
import com.google.gson.Gson;

import javax.ejb.Singleton;

@Singleton
public class DAONumber {

    private APICall apiCall;

    private static final String[] CATEGORIES = new String[]{"trivia", "math", "date", "year"};

    public DAONumber() {
        super();
        this.apiCall = new APICall("http://numbersapi.com/");
    }

    private Number getFact(String number, int category) {
        APIResponse response = apiCall.callApi(number + "/" + CATEGORIES[category]);

        return new Gson().fromJson(response.getContent(), Number.class);
    }

    /**
     * @param number   number for the fact
     * @param category 0 = triva, 1 = math, 3 = year
     * @return returns Number Fact in Number
     */
    public Number getFact(int number, int category) {
        if (category < 0 || 3 < category || category == 2) return getFact(number + "", 0);
        else return getFact(number + "", category);
    }

    /**
     * @param day      day for date fact
     * @param month    month for date fact
     * @param category 2 = date if not 2 then day and month will be added and category trivia will be chosen
     * @return returns Number Fact in Number
     */
    public Number getFact(int day, int month, int category) {
        if (category == 2) return getFact(month + "/" + day, category);
        else return getFact(day + month, 0);
    }


}