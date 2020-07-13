package ly.test.com.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import ly.test.com.mapper.JsonParseMapper;
import ly.test.com.pojo.*;
import ly.test.com.service.JsonParseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class JsonParseServiceImpl implements JsonParseService {
    @Autowired
    private JsonParseMapper jsonParseMapper;
    @Override
    public String getData() {

        return null;
    }

    @Override
    public String getStreetData() {
        List<String> streetNames = jsonParseMapper.getStreetName();
        List<Street> streetDatas = jsonParseMapper.getStreetData();
        List<StreetJson> streetJsons = new ArrayList<>();
        Map<String, List<Street>> streetMap = streetDatas.stream().collect(Collectors.groupingBy(Street::getStreetName));

        for (String str : streetMap.keySet()) {
            StreetJson streetJson = new StreetJson();
            streetJson.setStreetCode(streetMap.get(str).get(0).getStreetCode());
            streetJson.setStreetName(str);
            List<workTypeRankingData> childrenList = new ArrayList<>();
            for (Street street : streetMap.get(str)) {
                workTypeRankingData workTypeRankingData = new workTypeRankingData();
                workTypeRankingData.setTotalCount(street.getTotalCount());
                workTypeRankingData.setWorkName(street.getWorkName());
                workTypeRankingData.setWorkType(street.getWorkType());
                childrenList.add(workTypeRankingData);
            }
            streetJson.setWorkTypeRankingDataList(childrenList);
            streetJsons.add(streetJson);
        }


        String streetJsonList = JSON.toJSONString(streetJsons, SerializerFeature.WriteMapNullValue);
        return streetJsonList;
    }

    public String getMatterData(){
        List<Matter> matters = jsonParseMapper.getMatterData();
        String matterJson = JSON.toJSONString(matters, SerializerFeature.WriteMapNullValue);
        return matterJson;
    }

    public String getMatterDetailsData(){
        List<MatterDetails> matterDetails = jsonParseMapper.getMatterDetailsData();
        List<MatterDetailsJson> matterDetailsJsons = new ArrayList<>();
        for (MatterDetails matterDetail : matterDetails) {
            MatterDetailsJson matterDetailsJson = new MatterDetailsJson();
            matterDetailsJson.setMatterId(matterDetail.getMatterId());
            matterDetailsJson.setMatterTitle(matterDetail.getMatterTitle());
            matterDetailsJson.setMatterType(matterDetail.getMatterType());
            matterDetailsJson.setFrequency(matterDetail.getFrequency());
            matterDetailsJson.setWorkName(matterDetail.getWorkName());
            matterDetailsJson.setEntrustDept(matterDetail.getEntrustDept());
            matterDetailsJson.setWorkChildrenName(matterDetail.getWorkChildrenName());
            matterDetailsJson.setImplementationPerson(matterDetail.getImplementationPerson());
            matterDetailsJson.setTestType(matterDetail.getTestType());
            if (matterDetail.getInspectItemContentList()!=null && matterDetail.getInspectItemContentList()!="") {
                matterDetailsJson.setInspectItemContentList(Stream.of(matterDetail.getInspectItemContentList().split(";")).collect(Collectors.toList()));
            }
            matterDetailsJsons.add(matterDetailsJson);
        }
        String s = JSON.toJSONString(matterDetailsJsons, SerializerFeature.WriteMapNullValue);
        return  s;
    }
}
