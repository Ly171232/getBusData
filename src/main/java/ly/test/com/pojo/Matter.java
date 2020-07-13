package ly.test.com.pojo;

public class Matter {
    private String workType;
    private String matterId;
    private String matterTitle;
    private String matterCount;
    private String taskCount;

    public Matter() {
    }

    public Matter(String workType, String matterId, String matterTitle, String matterCount, String taskCount) {
        this.workType = workType;
        this.matterId = matterId;
        this.matterTitle = matterTitle;
        this.matterCount = matterCount;
        this.taskCount = taskCount;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId;
    }

    public String getMatterTitle() {
        return matterTitle;
    }

    public void setMatterTitle(String matterTitle) {
        this.matterTitle = matterTitle;
    }

    public String getMatterCount() {
        return matterCount;
    }

    public void setMatterCount(String matterCount) {
        this.matterCount = matterCount;
    }

    public String getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(String taskCount) {
        this.taskCount = taskCount;
    }
}
