package ly.test.com.pojo;

public class workTypeRankingData {
    private int totalCount;
    private String workName;
    private String workType;

    public workTypeRankingData() {
    }

    public workTypeRankingData(int totalCount, String workName, String workType) {
        this.totalCount = totalCount;
        this.workName = workName;
        this.workType = workType;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }
}
