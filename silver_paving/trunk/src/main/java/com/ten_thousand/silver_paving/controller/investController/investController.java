package com.ten_thousand.silver_paving.controller.investController;

import com.google.gson.JsonObject;
import com.shiyue.quartz.dto.*;
import com.shiyue.quartz.service.IinvestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/invest")
public class investController {

    @Autowired
    private IinvestService iinvestService;

//    生成产品投资页面，查询产品信息
@RequestMapping("/queryOneProd")
     public String queryOneProd(@RequestParam("prodId") Integer prodId, @RequestParam("investorId") Integer investorId, Model model){
         TbProduction tbProduction = iinvestService.queryOneProd(prodId);
          double percentage = ((tbProduction.getProdGivenNum()+tbProduction.getProdFroozenNum())/tbProduction.getProdPrice())*100;
          double expectedReturn = tbProduction.getInteUser()*10000;
          double proBalance = tbProduction.getProdPrice() - (tbProduction.getProdGivenNum() + tbProduction.getProdFroozenNum());
    AccountDto accountDto = iinvestService.queryAccountByInvestId(investorId);
//    账户余额
    double investorBalance = accountDto.getBalance();
//    剩余投资比例
    double investPercent = iinvestService.queryPercentOfProdBalance(prodId);
//    取整操作
    DecimalFormat df = new DecimalFormat("#.00");
    String investFormat = df.format(investPercent * 100);

//日期字符串切割
    String prodBegin = tbProduction.getProdBegin().toString().substring(0, 10);
    String prodEnd = tbProduction.getProdEnd().toString().substring(0, 10);

    model.addAttribute("prodInfo",tbProduction);
         model.addAttribute("Percentage",percentage);
         model.addAttribute("expectedReturn",expectedReturn);
         model.addAttribute("proBalance",proBalance);
         model.addAttribute("investorBalance",investorBalance);
         model.addAttribute("inteUser",tbProduction.getInteUser()*100);
         model.addAttribute("investPercent",investFormat);
         model.addAttribute("prodBegin",prodBegin);
         model.addAttribute("prodEnd",prodEnd);

         return "product";
     }


//    产品可投资金额
    @RequestMapping("/showBalanceOfProd")
    public String showBalanceOfProd(int prodId, Model model){
        double balance = iinvestService.showBalanceOfProd(prodId);
        model.addAttribute("BalanceOfProd",balance);
        return  null;
    }

//    查询判断是否可以支付：1、投资额小于账户余额与可投资余额
    @ResponseBody
    @RequestMapping("/prePay")
    public JsonObject prePay(int investId, int proId, int carId, double num, Model model){
        AccountDto accountDto = iinvestService.queryAccountByInvestId(investId);
        double accountBalance = accountDto.getBalance();
        double prodBalance = iinvestService.showBalanceOfProd(proId);
        Map<String,Object> map = new HashMap<>();
        JsonObject results = new JsonObject();
        if (num<accountBalance){
            if (num<prodBalance){
//              生成订单详情
                OrderInfoDto orderInfoDto = iinvestService.queryOrderInfoByProdId(proId);
//                 获取当前产品的利率和周期
                String dataLength = orderInfoDto.getDataLength();
                int dataLen = Integer.parseInt(dataLength);
//                 生成订单
                OrderDto orderDto = new OrderDto();
                orderDto.setAmountInvest(num);
                orderDto.setInvestorId(investId);
                orderDto.setOrderState("0");
                orderDto.setProdId(proId);
                orderDto.setCarId(carId);
                String uuid = UUID.randomUUID().toString();
                orderDto.setOrderNum(uuid);

//               起始时间
                Timestamp start = new Timestamp(System.currentTimeMillis());
                orderDto.setStartTime(start);
//                结束时间（应为产品结束时间）
                TbProduction tbProduction = iinvestService.queryOneProd(proId);
                orderDto.setEndTime(tbProduction.getProdEnd());
//                Calendar c = Calendar.getInstance();
//                c.add(Calendar.MONTH,dataLen);
//                Timestamp end = new Timestamp(c.getTime().getTime());
//                orderDto.setEndTime(end);
//              添加订单
                iinvestService.addOrder(orderDto);
//                锁定该产品中用户预计投资额度
                iinvestService.lockFroozenAmount(num,proId);

//                返回值给ajax

                results.addProperty("result",1);
                results.addProperty("orderNum",uuid);
                return results;
            }else {
//          产品可投资额度不足，请重新调整投资额度
                results.addProperty("result",2);
                return results;
            }
        }else {
//            账户可用余额不足，请充值
            results.addProperty("result",3);
            return results;

        }

    }

//    返回订单页面
    @RequestMapping("/queryOrderInfo")
    public String queryOrderInfo(@RequestParam("orderId") String orderNum, Model model){
//    获得订单
//        System.out.println(orderId);
//        System.out.println("断点");
        OrderDto orderDto = iinvestService.queryOrderByOrderNum(orderNum);
        OrderInfoDto orderInfoDto = iinvestService.queryOrderInfoByProdId(orderDto.getProdId());
////获取用户账户
        AccountDto accountDto = iinvestService.queryAccountByInvestId(orderDto.getInvestorId());
////    账户余额
        double investorBalance = accountDto.getBalance();
////获取产品
        TbProduction tbProduction = iinvestService.queryOneProd(orderDto.getProdId());
////获取预期收益
        double expectedReturn = tbProduction.getInteUser()*10000*Integer.parseInt(tbProduction.getDataLength());

        String  startTime = orderDto.getStartTime().toString().substring(0,10);
        String endTime = orderDto.getEndTime().toString().substring(0, 10);

        model.addAttribute("orderDto",orderDto);
        model.addAttribute("orderInfoDto",orderInfoDto);
        model.addAttribute("expectedReturn",expectedReturn);
        model.addAttribute("balanceInvestor",accountDto.getBalance());
        model.addAttribute("inteUser",orderInfoDto.getinteUser()*100);
        model.addAttribute("startTime",startTime);
        model.addAttribute("endTime",endTime);
        return "orderInfo";
    }
//    支付
    @RequestMapping("/payProd")
    public JsonObject payProd(double num,int proId,int investId,int orderId){
         iinvestService.payInvestProd(num,proId,investId,orderId);
        JsonObject results = new JsonObject();
        results.addProperty("results",1);
         return results;
    }




}
