package ly.test.com.mapper;

import ly.test.com.pojo.Details;
import ly.test.com.pojo.Matter;
import ly.test.com.pojo.MatterDetails;
import ly.test.com.pojo.Street;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JsonParseMapper {
    public abstract Details getData();

    //获取所有街道事业办信息
    public abstract List<Street> getStreetData();
    //获取事业办信息
    public abstract List<Matter> getMatterData();
    //获取事项详情信息
    public abstract List<MatterDetails> getMatterDetailsData();

    List<String> getStreetName();
}
