package com.ten_thousand.silver_paving.controller.lkc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ten_thousand.silver_paving.dto.lkc.TbRisk;
import com.ten_thousand.silver_paving.service.lkc.IRiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/risk")
public class RiskController {
    @Autowired
    private IRiskService iRiskService;
    @RequestMapping("/risksave")
    public String save(@RequestParam("tbRisk") TbRisk tbRisk){
        iRiskService.save(tbRisk);
        return "redirect:/riskList";
    }

    @RequestMapping("/riskdelete")
    public String delete(@RequestParam("riskId") Integer riskId){
        iRiskService.delete(riskId);
        return "redirect:/riskList";
    }
    @RequestMapping("/riskupdate")
    public String update(@RequestParam("riskId") Integer riskId){
        iRiskService.update(riskId);
        return "redirect:/riskList";
    }

    @RequestMapping("/riskList")
    public String byPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Map<String,Object> map){
        PageHelper.startPage(pg,5);
        List<TbRisk> list = iRiskService.queryAll();
        PageInfo<TbRisk> riskPageInfo = new PageInfo<>(list, 5);
        map.put("riskPageInfo",riskPageInfo);
        return "riskList";
    }

    @RequestMapping("/riskInfo")
    public String byIdInfo(@RequestParam("id")Integer id,Model model){
        TbRisk tbRisk = iRiskService.queryById(id);
        model.addAttribute("tbRisk",tbRisk);
        return "riskInfo";
    }

    @RequestMapping("/riskCount")
    public String queryCount(Model model){
        int count = iRiskService.queryCount();
        model.addAttribute("riskCount",count);
        return "riskList";
    }
}
