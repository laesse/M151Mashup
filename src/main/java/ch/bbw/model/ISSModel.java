package ch.bbw.model;

public class ISSModel {

    private IssPosition iss_position;
    private long timestamp;
    private String message;

    public ISSModel() {
        this(0.0, 0.0, 0L, "");
    }

    public ISSModel(Double latitude, Double longitude, long timestamp, String message) {
        super();
        this.iss_position = new IssPosition(latitude, longitude);
        this.timestamp = timestamp;
        this.message = message;
    }

    public Double getLatitude() {
        return this.iss_position.getLatitude();
    }

    public void setLatitude(Double latitude) {
        this.iss_position.setLatitude(latitude);
    }

    public Double getLongitude() {
        return this.iss_position.getLongitude();
    }

    public void setLongitude(Double longitude) {
        this.iss_position.setLongitude(longitude);
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.iss_position.toString() +" ; timestamp: "+ timestamp;
    }


}