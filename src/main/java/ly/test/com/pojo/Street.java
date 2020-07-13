package ly.test.com.pojo;

public class Street {
    private String streetName;
    private int totalCount;
    private String workName;
    private String workType;
    private String totalSumCount;
    private Long streetCode;

    public Street() {
    }

    public Street(String streetName, int totalCount, String workName, String workType, String totalSumCount, Long streetCode) {
        this.streetName = streetName;
        this.totalCount = totalCount;
        this.workName = workName;
        this.workType = workType;
        this.totalSumCount = totalSumCount;
        this.streetCode = streetCode;
    }

    public Long getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(Long streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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

    public String getTotalSumCount() {
        return totalSumCount;
    }

    public void setTotalSumCount(String totalSumCount) {
        this.totalSumCount = totalSumCount;
    }
}
