package ch.bbw.model;


public class Meme {
    private Result[] result;

    private String success;

    private String warning;

    private String elapsedMS;

    public Result[] getResult() {
        return result;
    }

    public void setResult(Result[] result) {
        this.result = result;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getElapsedMS() {
        return elapsedMS;
    }

    public void setElapsedMS(String elapsedMS) {
        this.elapsedMS = elapsedMS;
    }

    @Override
    public String toString() {
        return "ClassPojo [result = " + result + ", success = " + success + ", warning = " + warning + ", elapsedMS = " + elapsedMS + "]";
    }
}