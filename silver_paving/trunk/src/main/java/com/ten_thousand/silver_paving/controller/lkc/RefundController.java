package com.ten_thousand.silver_paving.controller.lkc;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ten_thousand.silver_paving.dto.lkc.TbRefund;
import com.ten_thousand.silver_paving.service.lkc.IRefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/refund")
public class RefundController {
    @Autowired
    private IRefundService iRefundService;
    @RequestMapping("/refundsave")
    public String save(@RequestParam("tbRefund") TbRefund tbRefund){
        iRefundService.save(tbRefund);
        return "redirect:/refundList";
    }

    @RequestMapping("/refunddelete")
    public String delete(@RequestParam("refundId") Integer refundId){
        iRefundService.delete(refundId);
        return "redirect:/refundList";
    }
    @RequestMapping("/refundupdate")
    public String update(@RequestParam("refundId") Integer refundId){
        iRefundService.update(refundId);
        return "redirect:/refundList";
    }

    @RequestMapping("/refundList")
    public String byPageList(@RequestParam(value = "pg",defaultValue = "1")Integer pg, Map<String,Object> map){
        PageHelper.startPage(pg,5);
        List<TbRefund> list = iRefundService.queryAll();
        PageInfo<TbRefund> refundPageInfo = new PageInfo<>(list, 5);
        map.put("refundPageInfo",refundPageInfo);
        return "refundList";
    }

    @RequestMapping("/refundInfo")
    public String byIdInfo(@RequestParam("id")Integer id,Model model){
        TbRefund tbRefund = iRefundService.queryById(id);
        model.addAttribute("tbRefund",tbRefund);
        return "refundInfo";
    }

    @RequestMapping("/refundCount")
    public String queryCount(Model model){
        int count = iRefundService.queryCount();
        model.addAttribute("refundCount",count);
        return "refundList";
    }
}
