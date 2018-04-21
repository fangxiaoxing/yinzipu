package com.ten_thousand.silver_paving.controller.lkc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ten_thousand.silver_paving.dto.lkc.TbProduction;
import com.ten_thousand.silver_paving.service.lkc.IProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.github.pagehelper.page.PageMethod.startPage;

@Controller
@RequestMapping("/production")
public class ProductionController {
    @Autowired
    private IProductionService iProductionService;
    @RequestMapping("/productionsave")
    public String save(@RequestParam("tbProduction") TbProduction tbProduction){
        iProductionService.save(tbProduction);
        return "redirect:/prodList";
    }

    @RequestMapping("/productiondelete")
    public String delete(@RequestParam("productionId") Integer productionId){
        iProductionService.delete(productionId);
        return "redirect:/prodList";
    }
    @RequestMapping("/productionupdate")
    public String update(@RequestParam("productionId") Integer productionId){
        iProductionService.update(productionId);
        return "redirect:/prodList";
    }

    @RequestMapping("/indexList")
        public String indexbyPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg,Model model,Map<String,Object> map){
        startPage(pg,7);
        List<TbProduction> more15Info = iProductionService.queryProductionMore15();
        List<TbProduction> productionList = iProductionService.productionvarge(more15Info);
        List<TbProduction> notFullInfo = iProductionService.queryProductionNotFull();
        List<TbProduction> productionList1 = iProductionService.productionvarge(notFullInfo);
        List<TbProduction> isFullInfo = iProductionService.queryProductionIsFull();
        List<TbProduction> productionList2 = iProductionService.productionvarge(isFullInfo);
        PageInfo<TbProduction> pageInfo = new PageInfo<>(productionList, 1);
        PageInfo<TbProduction> pageInfo1 = new PageInfo<>(productionList1, 4);
        PageInfo<TbProduction> pageInfo2 = new PageInfo<>(productionList2, 2);
        map.put("pageInfo",pageInfo);
        map.put("pageInfo1",pageInfo1);
        map.put("pageInfo2",pageInfo2);
//        model.addAttribute("more15Info",more15Info);
//        model.addAttribute("notFullInfo",notFullInfo);
//        model.addAttribute("isFullInfo",isFullInfo);
        return "index";
    }

    @RequestMapping("/productionInfo")
    public String queryAllParamsByName(@RequestParam("prodName")String prodName, Model model){
        List<TbProduction> productionList = iProductionService.queryAllParamsByName(prodName);
        List<TbProduction> productionvarge = iProductionService.productionvarge(productionList);
        List<TbProduction> list = iProductionService.productionshouyi(productionvarge);
        model.addAttribute("list",list);
        return "product";
    }
    @RequestMapping("/crowfundList")
    public String crowfundbyPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Model model,Map<String,Object> map){
        List<TbProduction> more15List =new ArrayList<>();
        List<TbProduction> notFullList =new ArrayList<>();
        List<TbProduction> isFullList =new ArrayList<>();
        PageHelper.startPage(pg,6);
        List<TbProduction> list =iProductionService.queryAllParams();
        List<TbProduction> productionList = iProductionService.productionvarge(list);
        PageInfo pageInfo = new PageInfo<>(productionList);
        map.put("pageInfo",pageInfo);
        for (TbProduction production:productionList){
            if(production.getProdtype().getInterest().getInteUser()>=15 && production.getProdFroozenNum()!=0){
                more15List.add(production);
            }else if (production.getProdFroozenNum()==0){
                isFullList.add(production);
            }else if(production.getProdtype().getInterest().getInteUser()<15 && production.getProdFroozenNum()!=0){
                notFullList.add(production);
            }
        }
        model.addAttribute("more15List",more15List);
        model.addAttribute("isFullList",isFullList);
        model.addAttribute("notFullList",notFullList);
        return "crowfund";
    }

    @RequestMapping("/prodList")
    public String byPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Map<String,Object> map){
        startPage(pg,5);
        List<TbProduction> list = iProductionService.queryAll();
        PageInfo<TbProduction> prodPageInfo = new PageInfo<>(list, 5);
        map.put("prodPageInfo",prodPageInfo);
        return "prodList";
    }

    @RequestMapping("/prodInfo")
    public String byIdInfo(@RequestParam("id")Integer id,Model model){
        TbProduction tbProduction = iProductionService.queryById(id);
        model.addAttribute("tbProduction",tbProduction);
        return "prodInfo";
    }

    @RequestMapping("/prodCount")
    public String queryCount(Model model){
        int count = iProductionService.queryCount();
        model.addAttribute("prodCount",count);
        return "prodList";
    }
}
