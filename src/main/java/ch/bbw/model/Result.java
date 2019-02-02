package ch.bbw.model;

public class Result {
    private String urlName;

    private String imageID;

    private String displayName;

    private String instanceUrl;

    private String generatorID;

    private String text0;

    private String mgUserID;

    private String instanceID;

    private EntityVotesSummary entityVotesSummary;

    private String text1;

    private String commentsCount;

    private String imageUrl;

    private String totalVotesScore;

    private String instanceImageUrl;

    private String username;

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInstanceUrl() {
        return instanceUrl;
    }

    public void setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    public String getGeneratorID() {
        return generatorID;
    }

    public void setGeneratorID(String generatorID) {
        this.generatorID = generatorID;
    }

    public String getText0() {
        return text0;
    }

    public void setText0(String text0) {
        this.text0 = text0;
    }

    public String getMgUserID() {
        return mgUserID;
    }

    public void setMgUserID(String mgUserID) {
        this.mgUserID = mgUserID;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public EntityVotesSummary getEntityVotesSummary() {
        return entityVotesSummary;
    }

    public void setEntityVotesSummary(EntityVotesSummary entityVotesSummary) {
        this.entityVotesSummary = entityVotesSummary;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTotalVotesScore() {
        return totalVotesScore;
    }

    public void setTotalVotesScore(String totalVotesScore) {
        this.totalVotesScore = totalVotesScore;
    }

    public String getInstanceImageUrl() {
        return instanceImageUrl;
    }

    public void setInstanceImageUrl(String instanceImageUrl) {
        this.instanceImageUrl = instanceImageUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ClassPojo [urlName = " + urlName + ", imageID = " + imageID + ", displayName = " + displayName + ", instanceUrl = " + instanceUrl + ", generatorID = " + generatorID + ", text0 = " + text0 + ", mgUserID = " + mgUserID + ", instanceID = " + instanceID + ", entityVotesSummary = " + entityVotesSummary + ", text1 = " + text1 + ", commentsCount = " + commentsCount + ", imageUrl = " + imageUrl + ", totalVotesScore = " + totalVotesScore + ", instanceImageUrl = " + instanceImageUrl + ", username = " + username + "]";
    }
}