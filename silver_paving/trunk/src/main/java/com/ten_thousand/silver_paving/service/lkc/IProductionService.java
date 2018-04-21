package com.ten_thousand.silver_paving.service.lkc;

import com.ten_thousand.silver_paving.dto.lkc.TbProduction;

import java.util.List;

public interface IProductionService {
    /**
     * 添加产品
     * @param production
     */
    void save(TbProduction production);

    /**
     * 删除产品
     * @param prodId
     */
    void delete(int prodId);

    /**
     * 按ID更新产品信息
     * @param prodId
     */
    void update(int prodId);

    /**
     * 全查
     * */
    List<TbProduction> queryAll();

    /*
        * 查询单条所有的参数
        * */
    List<TbProduction> queryAllParamsByName(String prodName);

    /*
    * 利率大于等于15的
    * */
    List<TbProduction> queryProductionMore15();

    /*
    *
    * */
    List<TbProduction> queryAllParams();

    /*
    * 招标未满
    * */
    List<TbProduction> queryProductionNotFull();

    /*
    * 招标已满
    * */
    List<TbProduction> queryProductionIsFull();
    /**
     * 按ID查找产品信息（更新页面的时候，需要获得页面信息，然后进行更新操作）
     * @param prodId
     * @return
     */
    TbProduction queryById(int prodId);

    /**
     * 查询产品记录总数
     * @return
     */
    int queryCount();
    /*
   * 动态查取投资百分比
   * */
    List<TbProduction> productionvarge(List<TbProduction> tbProductionList);

    /*
    * 万元收益
    * */
    List<TbProduction> productionshouyi(List<TbProduction> tbProductionList);
}
