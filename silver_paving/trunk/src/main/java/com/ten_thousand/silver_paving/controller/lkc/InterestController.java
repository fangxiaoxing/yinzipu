package com.ten_thousand.silver_paving.controller.lkc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ten_thousand.silver_paving.dto.lkc.TbInterest;
import com.ten_thousand.silver_paving.service.lkc.IInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/interest")
public class InterestController {
    @Autowired
    private IInterestService iInterestService;
    @RequestMapping("/interestsave")
    public String save(@RequestParam("tbInterest") TbInterest tbInterest){
        iInterestService.save(tbInterest);
        return "redirect:/inteList";
    }

    @RequestMapping("/interestdelete")
    public String delete(@RequestParam("inteId") Integer inteId){
        iInterestService.delete(inteId);
        return "redirect:/inteList";
    }
    @RequestMapping("/interestupdate")
    public String update(@RequestParam("inteId") Integer inteId){
        iInterestService.update(inteId);
        return "redirect:/inteList";
    }

    @RequestMapping("/inteList")
    public String byPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Map<String,Object> map){
        PageHelper.startPage(pg,5);
        List<TbInterest> list = iInterestService.queryAll();
        PageInfo<TbInterest> intePageInfo = new PageInfo<>(list, 5);
        map.put("intePageinfo",intePageInfo);
        return "inteList";
    }

    @RequestMapping("/inteInfo")
    public String byIdInfo(@RequestParam("id")Integer id,Model model){
        TbInterest tbInterest = iInterestService.queryById(id);
        model.addAttribute("tbInterest",tbInterest);
        return "inteInfo";
    }

    @RequestMapping("/inteCount")
    public String queryCount(Model model){
        int count = iInterestService.queryCount();
        model.addAttribute("inteCount",count);
        return "inteList";
    }
}
