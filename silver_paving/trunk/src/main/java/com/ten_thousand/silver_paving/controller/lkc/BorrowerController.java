package com.ten_thousand.silver_paving.controller.lkc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import com.ten_thousand.silver_paving.service.lkc.IBorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/borrower")
public class BorrowerController {
    @Autowired
    private IBorrowerService borrowerService;

    @RequestMapping("/borrowersave")
    public String save(@RequestParam("tbBorrower") TbBorrower tbBorrower){
        borrowerService.save(tbBorrower);
        return "redirect:/borrList";
    }

    @RequestMapping("/borrowerdelete")
    public String delete(@RequestParam("borrId") Integer borrId){
        borrowerService.delete(borrId);
        return "redirect:/borrList";
    }
    @RequestMapping("/borrowerupdate")
    public String update(@RequestParam("borrId") Integer borrId){
        borrowerService.update(borrId);
        return "redirect:/borrList";
    }

    @RequestMapping("/borrList")
    public String byPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Map<String,Object> map){
        PageHelper.startPage(pg,5);
        List<TbBorrower> list = borrowerService.queryAll();
        PageInfo<TbBorrower> borrowerPageInfo = new PageInfo<>(list, 5);
        map.put("borrPageinfo",borrowerPageInfo);
        return "borrList";
    }

    @RequestMapping("/borrInfo")
    public String byIdInfo(@RequestParam("id")Integer id,Model model){
        TbBorrower tbBorrower = borrowerService.queryById(id);
        model.addAttribute("tbBorrower",tbBorrower);
        return "borrInfo";
    }

    @RequestMapping("/borrCount")
    public String queryCount(Model model){
        int count = borrowerService.queryCount();
        model.addAttribute("borrCount",count);
        return "borrList";
    }
}
