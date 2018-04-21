package com.ten_thousand.silver_paving.dao.investorDao;

import com.ten_thousand.silver_paving.dto.*;

import java.sql.Timestamp;
import java.util.List;


public interface IinvestDao {

//    查询产品页面
    TbProduction queryOneProd(int prodId);

    //   投资付款修改用户账户
    void invest(double num, int accountId);
//查询用户余额
    double queryBalance(int investorId);
//产生结果页面
    OrderInfoDto queryOrderInfoByProdId(int prodId);

//  查询产品的三相金额
    prodAmountDto queryProdAmount(int prodId);

//   添加被冻结的资金，锁定客户预定金额
    void lockFroozenAmount(double amount, int prodId);

// 解锁冻结的额度
    void unlockFroozenAmount(double amount, int prodId);

//   产品付款，增加已付款，减少未付款
    void payOrderToProd(double num, int prodId);

//    修改产品状态
    void chageStateOfProduction(String state, int prodId);

//    创建订单表
    void addOrder(OrderDto orderDto);

//    修改订单表状态
    void updateOrderState(String state, int orderId);

//    查询账户状态
    AccountDto queryAccountByInvestId(int investorId);

////    查询一个订单
     OrderDto queryOneOrderById(int orderId);

//查询大于这个时间的订单
List<OrderDto> queryRealTimeOrder(Timestamp times);

//用订单编号查订单
    OrderDto queryOrderByOrderNum(String orderNum);

}
