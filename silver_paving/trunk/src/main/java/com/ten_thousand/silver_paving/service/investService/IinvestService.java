package com.ten_thousand.silver_paving.service.investService;


import com.ten_thousand.silver_paving.dto.*;


public interface IinvestService {

    //    查询产品页面
    TbProduction queryOneProd(int prodId);

//    查询账户余额
    double queryBalance(int investorId);

//    查询产品的三个额度
  prodAmountDto queryProdAmount(int prodId);

//显示可投资余额
   double showBalanceOfProd(int prodId);


//   生成订单确认页面
   OrderInfoDto queryOrderInfoByProdId(int prodId);


//    创建订单表
void addOrder(OrderDto orderDto);

  //   添加被冻结的资金，锁定客户预定金额
    void lockFroozenAmount(double amount, int prodId);


    // 解锁冻结的额度
    void unlockFroozenAmount(double amount, int prodId);

    //   产品付款，增加已付款，减少未付款
    void payOrderToProd(double num, int prodId);

    //    账户转账
    void invest(double num, int accountId);

    //付款操作
    void payInvestProd(double num, int prodId, int investId, int orderId);

    //    查询账户状态
    AccountDto queryAccountByInvestId(int investorId);


    //    修改订单表状态
    void updateOrderState(String state, int orderId);

    //    查询可以投资的比例
    double queryPercentOfProdBalance(int prodId);

//    //    查询一个订单
    OrderDto queryOneOrderById(int orderId);

    //用订单编号查订单
    OrderDto queryOrderByOrderNum(String orderNum);

}
