package com.ten_thousand.silver_paving.service.investService.impl;

import com.ten_thousand.silver_paving.dao.investorDao.IinvestDao;
import com.ten_thousand.silver_paving.dto.*;
import com.ten_thousand.silver_paving.service.investService.IinvestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("investService")
public class investService implements IinvestService {

    @Autowired
    private IinvestDao iinvestDao;

    @Override
    public TbProduction queryOneProd(int prodId) {
        return iinvestDao.queryOneProd(prodId);
    }

    //    查询账户余额
    @Override
    public double queryBalance(int investorId) {
        return iinvestDao.queryBalance(investorId);
    }
    //    查询产品的三个额度
    @Override
    public prodAmountDto queryProdAmount(int prodId) {
        return iinvestDao.queryProdAmount(prodId);
    }
//查询可投资余额
    @Override
    public double showBalanceOfProd(int prodId) {
        prodAmountDto prodAmountDto = iinvestDao.queryProdAmount(prodId);
        double prodPrice = prodAmountDto.getProdPrice();
        double prodGivenNum = prodAmountDto.getProdGivenNum();
        double prodFroozenNum = prodAmountDto.getProdFroozenNum();
        double prodBalance = prodPrice-prodGivenNum-prodFroozenNum;
        return prodBalance;
    }

//    查询可以投资的比例
    public double queryPercentOfProdBalance(int prodId){
        prodAmountDto prodAmountDto = iinvestDao.queryProdAmount(prodId);
        double prodPrice = prodAmountDto.getProdPrice();
        double prodGivenNum = prodAmountDto.getProdGivenNum();
        double prodFroozenNum = prodAmountDto.getProdFroozenNum();
        double prodBalance = prodGivenNum+prodFroozenNum;
        double investPercent = prodBalance/prodPrice;
        return investPercent;
    }

    @Override
    public OrderDto queryOneOrderById(int orderId) {
        return iinvestDao.queryOneOrderById(orderId);
    }

    @Override
    public OrderDto queryOrderByOrderNum(String orderNum) {
        return iinvestDao.queryOrderByOrderNum(orderNum);
    }

    @Override
    public OrderInfoDto queryOrderInfoByProdId(int prodId) {
        return iinvestDao.queryOrderInfoByProdId(prodId);
    }

    //    创建订单表
    @Override
    public void addOrder(OrderDto orderDto) {
          iinvestDao.addOrder(orderDto);
    }

    //   添加被冻结的资金，锁定客户预定金额
    @Override
    public void lockFroozenAmount(double amount, int prodId) {
           iinvestDao.lockFroozenAmount(amount,prodId);
    }

    // 解锁冻结的额度
    @Override
    public void unlockFroozenAmount(double amount, int prodId) {
           iinvestDao.unlockFroozenAmount(amount,prodId);
    }

    //   产品付款，增加已付款，减少未付款
    @Override
    public void payOrderToProd(double num, int prodId) {
         iinvestDao.payOrderToProd(num,prodId);
    }

    //    账户转账
    @Override
    public void invest(double num, int accountId) {
         iinvestDao.invest(num,accountId);
    }

    //付款操作
    @Override
    @Transactional
    public void payInvestProd(double num, int prodId, int investId,int orderId) {
//       首先进行账户和产品的变化
        iinvestDao.payOrderToProd(num,prodId);
        iinvestDao.invest(num,investId);
//        修改订单的状态
        iinvestDao.updateOrderState("1",orderId);

////        检测用户的账户变化是否正常
//        AccountDto accountDto = iinvestDao.queryAccountByInvestId(investId);
////        总额
//        double totalDeposits = accountDto.getTotalDeposits();
////        余额
//        double balance = accountDto.getBalance();
////        总投资额
//        double amountInvest = accountDto.getAmountInvest();
////        如果账户不守恒则手动回滚事务
//        if(!(totalDeposits==balance+amountInvest)){
//
//        }
    }


    //    查询账户状态
    @Override
    public AccountDto queryAccountByInvestId(int investorId) {
        return iinvestDao.queryAccountByInvestId(investorId);
    }

    //    修改订单表状态
    @Override
    public void updateOrderState(String state, int orderId) {
        iinvestDao.updateOrderState(state,orderId);
    }


}
