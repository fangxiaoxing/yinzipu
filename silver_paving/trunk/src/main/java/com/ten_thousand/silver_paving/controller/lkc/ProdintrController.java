package com.ten_thousand.silver_paving.controller.lkc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ten_thousand.silver_paving.dto.lkc.TbProdintr;
import com.ten_thousand.silver_paving.service.lkc.IProdintrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/prodintr")
public class ProdintrController {
    @Autowired
    private IProdintrService iProdintrService;
    @RequestMapping("/prodintrsave")
    public String save(@RequestParam("tbProdintr") TbProdintr tbProdintr){
        iProdintrService.save(tbProdintr);
        return "redirect:/prodintrList";
    }

    @RequestMapping("/prodintrdelete")
    public String delete(@RequestParam("prodintrId") Integer prodintrId){
        iProdintrService.delete(prodintrId);
        return "redirect:/prodintrList";
    }
    @RequestMapping("/prodintrupdate")
    public String update(@RequestParam("prodintrId") Integer prodintrId){
        iProdintrService.update(prodintrId);
        return "redirect:/prodintrList";
    }

    @RequestMapping("/prodintrList")
    public String byPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Map<String,Object> map){
        PageHelper.startPage(pg,5);
        List<TbProdintr> list = iProdintrService.queryAll();
        PageInfo<TbProdintr> prodintrPageInfo = new PageInfo<>(list, 5);
        map.put("prodintrPageInfo",prodintrPageInfo);
        return "prodintrList";
    }

    @RequestMapping("/prodintrInfo")
    public String byIdInfo(@RequestParam("id")Integer id,Model model){
        TbProdintr tbProdintr = iProdintrService.queryById(id);
        model.addAttribute("tbProdintr",tbProdintr);
        return "prodintrInfo";
    }

    @RequestMapping("/prodintrCount")
    public String queryCount(Model model){
        int count = iProdintrService.queryCount();
        model.addAttribute("prodintrCount",count);
        return "prodintrList";
    }
}
