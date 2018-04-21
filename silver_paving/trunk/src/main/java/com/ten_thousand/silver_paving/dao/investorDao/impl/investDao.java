package com.ten_thousand.silver_paving.dao.investorDao.impl;


import com.ten_thousand.silver_paving.dao.investorDao.IinvestDao;
import com.ten_thousand.silver_paving.dao.investorDao.baseDao;
import com.ten_thousand.silver_paving.dto.*;
import com.ten_thousand.silver_paving.dto.OrderDto;
import com.ten_thousand.silver_paving.dto.OrderInfoDto;
import com.ten_thousand.silver_paving.dto.prodAmountDto;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class investDao extends baseDao implements IinvestDao {

    @Override
    public TbProduction queryOneProd(int prodId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryOneProd",prodId);
    }

    //   投资付款修改用户账户
    @Override
    public void invest(double num, int accountId) {
        Map<String,Object> map = new HashMap<>();
        map.put("num1",num);
        map.put("num2",num);
        map.put("accountId",accountId);
        getSqlSession().update("com.ten_thousand.silver_paving.dto.investMapper.invest",map);
    }
    //查询用户余额
    @Override
    public double queryBalance(int investorId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.investMapper.queryBalance",investorId);
    }
    //待支付订单页面
    @Override
    public OrderInfoDto queryOrderInfoByProdId(int prodId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryOrderInfoByProId",prodId);
    }

    //  查询产品的三相金额
    @Override
    public prodAmountDto queryProdAmount(int prodId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryProdAmount",prodId);
    }


    //   添加被冻结的资金，锁定客户预定金额
    @Override
    public void lockFroozenAmount(double amount, int prodId) {
        Map<String,Object> map = new HashMap<>();
        map.put("amount",amount);
        map.put("prodId",prodId);
        getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.lockFroozenAmount",map);
    }
//解锁冻结资金
    @Override
    public void unlockFroozenAmount(double amount, int prodId) {
        Map<String,Object> map = new HashMap<>();
        map.put("amount",amount);
        map.put("prodId",prodId);
        getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.unlockFroozenAmount",map);
    }

    //   付款，增加已付款，减少未付款
    @Override
    public void payOrderToProd(double num, int prodId) {
        Map<String,Object> map = new HashMap<>();
        map.put("num1",num);
        map.put("num2",num);
        map.put("prodId",prodId);
       getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.payOrderToProd",map);
    }

    //    修改产品状态
    @Override
    public void chageStateOfProduction(String state, int prodId) {
        Map<String,Object> map = new HashMap<>();
        map.put("state",state);
        map.put("prodId",prodId);
        getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.chageStateOfProduction",map);
    }

    //    写入订单表
    @Override
    public void addOrder(OrderDto orderDto) {
        getSqlSession().insert("com.ten_thousand.silver_paving.dto.orderMapper.addOrder",orderDto);
    }
    //    修改订单表状态
    @Override
    public void updateOrderState(String state,int orderId) {
        Map<String,Object> map = new HashMap<>();
        map.put("state",state);
        map.put("orderId",orderId);
        getSqlSession().update("com.ten_thousand.silver_paving.dto.orderMapper.updateOrderState",map);
    }

    @Override
    public AccountDto queryAccountByInvestId(int investorId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.investMapper.queryAccountByInvestId", investorId);

    }

    @Override
    public OrderDto queryOneOrderById(int orderId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.orderMapper.queryOneOrderById",orderId);
    }

    @Override
    public List<OrderDto> queryRealTimeOrder(Timestamp times) {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.orderMapper.queryRealTimeOrder",times);
    }

    //用订单编号查订单
    @Override
    public OrderDto queryOrderByOrderNum(String orderNum) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.orderMapper.queryOrderByOrderNum",orderNum);
    }


}
