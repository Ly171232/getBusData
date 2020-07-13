package ly.test.com.pojo;

import java.util.List;

public class StreetJson {
    private String streetName;
    private Long streetCode;
    private List<workTypeRankingData> workTypeRankingDataList;

    public StreetJson() {
    }

    public StreetJson(String streetName, Long streetCode, List<workTypeRankingData> workTypeRankingDataList) {
        this.streetName = streetName;
        this.streetCode = streetCode;
        this.workTypeRankingDataList = workTypeRankingDataList;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public List<workTypeRankingData> getWorkTypeRankingDataList() {
        return workTypeRankingDataList;
    }

    public void setWorkTypeRankingDataList(List<workTypeRankingData> workTypeRankingDataList) {
        this.workTypeRankingDataList = workTypeRankingDataList;
    }

    public Long getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(Long streetCode) {
        this.streetCode = streetCode;
    }
}
