package com.ten_thousand.silver_paving.controller.lkc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ten_thousand.silver_paving.dto.lkc.TbDate;
import com.ten_thousand.silver_paving.service.lkc.IDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/date")
public class DateController {
    @Autowired
    private IDateService dateService;
    @RequestMapping("/datesave")
    public String save(@RequestParam("tbDate") TbDate tbDate){
        dateService.save(tbDate);
        return "redirect:/dateList";
    }

    @RequestMapping("/datedelete")
    public String delete(@RequestParam("dateId") Integer dateId){
        dateService.delete(dateId);
        return "redirect:/dateList";
    }
    @RequestMapping("/dateupdate")
    public String update(@RequestParam("dateId") Integer dateId){
        dateService.update(dateId);
        return "redirect:/dateList";
    }

    @RequestMapping("/dateList")
    public String byPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Map<String,Object> map){
        PageHelper.startPage(pg,5);
        List<TbDate> list = dateService.queryAll();
        PageInfo<TbDate> datePageInfo = new PageInfo<>(list, 5);
        map.put("datePageinfo",datePageInfo);
        return "dateList";
    }

    @RequestMapping("/dateInfo")
    public String byIdInfo(@RequestParam("id")Integer id,Model model){
        TbDate tbDate = dateService.queryById(id);
        model.addAttribute("tbDate",tbDate);
        return "dateInfo";
    }

    @RequestMapping("/dateCount")
    public String queryCount(Model model){
        int count = dateService.queryCount();
        model.addAttribute("dateCount",count);
        return "dateList";
    }
}
