package ch.bbw.model;

public class EntityVotesSummary {
    private String entityName;

    private String userVoteScore;

    private String entityID;

    private String userID;

    private String totalVotesSum;

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getUserVoteScore() {
        return userVoteScore;
    }

    public void setUserVoteScore(String userVoteScore) {
        this.userVoteScore = userVoteScore;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTotalVotesSum() {
        return totalVotesSum;
    }

    public void setTotalVotesSum(String totalVotesSum) {
        this.totalVotesSum = totalVotesSum;
    }

    @Override
    public String toString() {
        return "ClassPojo [entityName = " + entityName + ", userVoteScore = " + userVoteScore + ", entityID = " + entityID + ", userID = " + userID + ", totalVotesSum = " + totalVotesSum + "]";
    }
}
