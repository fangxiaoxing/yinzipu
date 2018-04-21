package com.ten_thousand.silver_paving.service.lkc;

import com.ten_thousand.silver_paving.dto.lkc.TbInterest;
import com.ten_thousand.silver_paving.dto.lkc.TbProdintr;

import java.util.List;

public interface IProdintrService {
    /**
     * 添加简介
     * @param prodintr
     */
    void save(TbProdintr prodintr);

    /**
     * 删除简介
     * @param prodintrId
     */
    void delete(int prodintrId);

    /**
     * 按ID更新简介信息
     * @param prodintrId
     */
    void update(int prodintrId);

    /**
     * 全查
     * */
    List<TbProdintr> queryAll();

    /**
     * 按ID查找简介信息（更新页面的时候，需要获得页面信息，然后进行更新操作）
     * @param prodintrId
     * @return
     */
    TbProdintr queryById(int prodintrId);

    /**
     * 查询简介记录总数
     * @return
     */
    int queryCount();
}
