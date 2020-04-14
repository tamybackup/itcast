package com.baidu.controller;

import com.baidu.domain.Epidemic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/epidemic")
public class EpidemicController {

    @RequestMapping("/data")
    public ModelAndView table(){
        ModelAndView mv=new ModelAndView();
        List<Epidemic> epidemicList=new ArrayList<Epidemic>();
        //第一行数据
        Epidemic epidemic1=new Epidemic();
        epidemic1.setArea("湖北");
        epidemic1.setNewPeople(0);
        epidemic1.setExisting(219);
        epidemic1.setAccumulative(67803);
        epidemic1.setCure(64363);
        epidemic1.setDeath(3221);
        epidemicList.add(epidemic1);

        //第二行数据
        Epidemic epidemic2=new Epidemic();
        epidemic2.setArea("上海");
        epidemic2.setNewPeople(0);
        epidemic2.setExisting(143);
        epidemic2.setAccumulative(618);
        epidemic2.setCure(468);
        epidemic2.setDeath(7);
        epidemicList.add(epidemic2);

        //第三行数据
        Epidemic epidemic3=new Epidemic();
        epidemic3.setArea("广东");
        epidemic3.setNewPeople(9);
        epidemic3.setExisting(98);
        epidemic3.setAccumulative(1564);
        epidemic3.setCure(1458);
        epidemic3.setDeath(8);
        epidemicList.add(epidemic3);


        mv.addObject("epidemicList",epidemicList);
        mv.setViewName("data");
        return mv;
    }
}
