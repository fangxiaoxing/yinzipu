package com.ten_thousand.silver_paving.dao.lkc;

import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import com.ten_thousand.silver_paving.dto.lkc.TbRefund;

import java.util.List;

public interface IRefundDAO {
    /**
     * 添加还款方式
     * @param refund
     */
    void save(TbRefund refund);

    /**
     * 删除还款方式
     * @param refundId
     */
    void delete(int refundId);

    /**
     * 按ID更新还款方式信息
     * @param refundId
     */
    void update(int refundId);

    /*
    * 全查
    * */
    List<TbRefund> queryAll();

    /**
     * 按ID查找还款方式信息（更新页面的时候，需要获得页面信息，然后进行更新操作）
     * @param refundId
     * @return
     */
    TbRefund queryById(int refundId);

    /**
     * 查询还款方式记录总数
     * @return
     */
    int queryCount();
}
