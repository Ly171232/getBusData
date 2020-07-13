package ly.test.com.controller;

import ly.test.com.service.JsonParseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonParseController {
    @Autowired
    private JsonParseService jsonParseService;
    @RequestMapping("/getData")
    @ResponseBody
    public void getJsonData(){
        String matterDetails = jsonParseService.getMatterDetailsData();
        String streetDatas = jsonParseService.getStreetData();
        String matters = jsonParseService.getMatterData();
        System.out.println(matterDetails);
        System.out.println(streetDatas);
        System.out.println(matters);
    }


}
