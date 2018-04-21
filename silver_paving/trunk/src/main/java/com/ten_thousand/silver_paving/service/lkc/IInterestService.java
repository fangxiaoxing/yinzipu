package com.ten_thousand.silver_paving.service.lkc;

import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import com.ten_thousand.silver_paving.dto.lkc.TbInterest;

import java.util.List;

public interface IInterestService {
    /**
     * 添加利率
     * @param interest
     */
    void save(TbInterest interest);

    /**
     * 删除利率
     * @param inteId
     */
    void delete(int inteId);

    /**
     * 按ID更新利率信息
     * @param inteId
     */
    void update(int inteId);

    /**
     * 全查
     * */
    List<TbInterest> queryAll();

    /**
     * 按ID查找利率信息（更新页面的时候，需要获得页面信息，然后进行更新操作）
     * @param inteId
     * @return
     */
    TbInterest queryById(int inteId);

    /**
     * 查询利率记录总数
     * @return
     */
    int queryCount();
}
