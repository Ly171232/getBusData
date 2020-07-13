package ly.test.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EchartsController {

    @RequestMapping("/first")
    public String demo1(){
        return "echarts";
    }
}
