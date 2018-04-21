package com.ten_thousand.silver_paving.controller.lkc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ten_thousand.silver_paving.dto.lkc.TbProdtype;
import com.ten_thousand.silver_paving.service.lkc.IProdtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/prodtype")
public class ProdtypeController {
    @Autowired
    private IProdtypeService iProdtypeService;
    @RequestMapping("/prodtypesave")
    public String save(@RequestParam("tbProdtype") TbProdtype tbProdtype){
        iProdtypeService.save(tbProdtype);
        return "redirect:/prodtypList";
    }

    @RequestMapping("/prodtypedelete")
    public String delete(@RequestParam("prodtypeId") Integer prodtypeId){
        iProdtypeService.delete(prodtypeId);
        return "redirect:/prodtypList";
    }
    @RequestMapping("/prodtypeupdate")
    public String update(@RequestParam("prodtypeId") Integer prodtypeId){
        iProdtypeService.update(prodtypeId);
        return "redirect:/prodtypList";
    }

    @RequestMapping("/prodtypList")
    public String byPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Map<String,Object> map){
        PageHelper.startPage(pg,5);
        List<TbProdtype> list = iProdtypeService.queryAll();
        PageInfo<TbProdtype> prodtypePageInfo = new PageInfo<>(list, 5);
        map.put("prodtypePageInfo",prodtypePageInfo);
        return "prodtypList";
    }

    @RequestMapping("/prodtypeInfo")
    public String byIdInfo(@RequestParam("id")Integer id,Model model){
        TbProdtype tbProdtype = iProdtypeService.queryById(id);
        model.addAttribute("tbProdtype",tbProdtype);
        return "prodtypeInfo";
    }

    @RequestMapping("/prodtypeCount")
    public String queryCount(Model model){
        int count = iProdtypeService.queryCount();
        model.addAttribute("prodtypeCount",count);
        return "prodtypList";
    }
}
