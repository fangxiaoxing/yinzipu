package com.ten_thousand.silver_paving.dao.lkc;

import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;

import java.util.List;

public interface IBorrowerDAO {
    /**
     * 添加借款人
     * @param borrower
     */
    void save(TbBorrower borrower);

    /**
     * 删除借款人
     * @param borrId
     */
    void delete(int borrId);

    /**
     * 按ID更新借款人信息
     * @param borrId
     */
    void update(int borrId);

    /*
    * 全查
    * */
    List<TbBorrower> queryAll();

    /**
     * 按ID查找借款人信息（更新页面的时候，需要获得页面信息，然后进行更新操作）
     * @param borrId
     * @return
     */
    TbBorrower queryById(int borrId);



    /**
     * 查询借款人记录总数
     * @return
     */
    int queryCount();

}
