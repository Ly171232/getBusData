package ly.test.com.service;

import ly.test.com.pojo.GongJiao;

import java.util.List;

public interface BusDataService {
    void add();

    void saveData(List<GongJiao> gongJiao);

    List<String> getBus();
}
