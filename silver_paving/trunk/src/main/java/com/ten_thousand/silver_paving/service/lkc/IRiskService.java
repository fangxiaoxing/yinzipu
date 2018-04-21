package com.ten_thousand.silver_paving.service.lkc;

import com.ten_thousand.silver_paving.dto.lkc.TbInterest;
import com.ten_thousand.silver_paving.dto.lkc.TbRisk;

import java.util.List;

public interface IRiskService {
    /**
     * 添加风控
     * @param risk
     */
    void save(TbRisk risk);

    /**
     * 删除风控
     * @param riskId
     */
    void delete(int riskId);

    /**
     * 按ID更新风控信息
     * @param riskId
     */
    void update(int riskId);

    /**
     * 全查
     * */
    List<TbRisk> queryAll();

    /**
     * 按ID查找风控信息（更新页面的时候，需要获得页面信息，然后进行更新操作）
     * @param riskId
     * @return
     */
    TbRisk queryById(int riskId);

    /**
     * 查询风控记录总数
     * @return
     */
    int queryCount();
}
