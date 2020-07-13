package ly.test.com.service.impl;

import ly.test.com.mapper.BusDataMapper;
import ly.test.com.pojo.GongJiao;
import ly.test.com.service.BusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusDataServiceImpl implements BusDataService {
    @Autowired
    private BusDataMapper busDataDao;
    @Override
    public void add() {
        busDataDao.add();
    }


    @Override
    public void saveData(List<GongJiao> gongJiao) {
        /*for (GongJiao jiao : gongJiao) {
            busDataDao.saveData(jiao);
        }*/
        busDataDao.saveData(gongJiao);
    }

    @Override
    public List<String> getBus() {
        return busDataDao.getBus();
    }
}
