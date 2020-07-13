package ly.test.com.mapper;

import ly.test.com.pojo.GongJiao;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusDataMapper {
    @Insert("insert into gongjiao values('a','b','c','d')")
    void add();
    //@Insert("insert into gongjiao (name,Lat,Lng,line) value (#{gongJiao.name},#{gongJiao.Lat},#{gongJiao.Lng},#{gongJiao.line}) ")
    void saveData(List<GongJiao> gongJiao);
    List<String> getBus();
}
