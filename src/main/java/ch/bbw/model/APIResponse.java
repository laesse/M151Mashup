package ch.bbw.model;

public class APIResponse {
    private int statusCode;
    private String content;

    public APIResponse(int statusCode, String content) {
        super();
        this.statusCode = statusCode;
        this.content = content;
    }
    public APIResponse() {
        this(0,null);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
