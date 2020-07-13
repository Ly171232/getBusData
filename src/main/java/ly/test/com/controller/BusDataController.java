package ly.test.com.controller;

import com.alibaba.fastjson.JSON;
import ly.test.com.pojo.GongJiao;
import ly.test.com.service.BusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/busData")
public class BusDataController {
    @Autowired
    private BusDataService busDataService;


    @RequestMapping("/add")
    @ResponseBody
    public void Add(){
        busDataService.add();
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/map")
    public String map(){
        return "map";
    }
    @RequestMapping("/saveData")
    @ResponseBody
    public String saveData(String data,@RequestParam("line") String line,@RequestParam("name") String namese,@RequestParam("startTime") String startTime,@RequestParam("endTime") String endTime,@RequestParam("company") String company){
        List<GongJiao> gongJiao = JSON.parseArray(data, GongJiao.class);
        gongJiao.stream().forEach(g-> {g.setLine(line);g.setTime(startTime+"-"+endTime);g.setNamese(namese);g.setCompany(company);});
        System.out.println(gongJiao);
        busDataService.saveData(gongJiao);
        return "success";
    }

    @RequestMapping("/getBus")
    @ResponseBody
    public void getBus(){
        List<String> bus = busDataService.getBus();
        StringBuilder sb = new StringBuilder();
        for (String bus1 : bus) {
            sb.append("'"+bus1+"',");
        }
        System.out.println(sb);
    }

}
