package com.ten_thousand.silver_paving.dao.lkc;

import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import com.ten_thousand.silver_paving.dto.lkc.TbProdtype;

import java.util.List;

public interface IProdtypeDAO {
    /**
     * 添加产品类型
     * @param prodtype
     */
    void save(TbProdtype prodtype);

    /**
     * 删除产品类型
     * @param prodtypeId
     */
    void delete(int prodtypeId);

    /**
     * 按ID更新产品类型信息
     * @param prodtypeId
     */
    void update(int prodtypeId);

    /*
    * 全查
    * */
    List<TbProdtype> queryAll();

    /**
     * 按ID查找产品类型信息（更新页面的时候，需要获得页面信息，然后进行更新操作）
     * @param prodtypeId
     * @return
     */
    TbProdtype queryById(int prodtypeId);

    /**
     * 查询产品类型记录总数
     * @return
     */
    int queryCount();
}
