package com.ten_thousand.silver_paving.dao.lkc;

import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import com.ten_thousand.silver_paving.dto.lkc.TbCar;
import com.ten_thousand.silver_paving.dto.lkc.TbDate;

import java.util.List;

public interface IDateDAO {
    /**
     * 添加期限
     * @param date
     */
    void save(TbDate date);

    /**
     * 删除期限
     * @param dateId
     */
    void delete(int dateId);

    /**
     * 按ID更新期限信息
     * @param dateId
     */
    void update(int dateId);

    /*
    * 全查
    * */
    List<TbDate> queryAll();

    /**
     * 按ID查找期限信息（更新页面的时候，需要获得页面信息，然后进行更新操作）
     * @param dateId
     * @return
     */
    TbDate queryById(int dateId);

    /**
     * 查询期限记录总数
     * @return
     */
    int queryCount();
}
