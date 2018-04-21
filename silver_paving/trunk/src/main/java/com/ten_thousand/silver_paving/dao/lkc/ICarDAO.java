package com.ten_thousand.silver_paving.dao.lkc;

import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import com.ten_thousand.silver_paving.dto.lkc.TbCar;

import java.util.List;

public interface ICarDAO {
    /**
     * 添加车辆
     * @param car
     */
    void save(TbCar car);

    /**
     * 删除车辆
     * @param carId
     */
    void delete(int carId);

    /**
     * 按ID更新车辆信息
     * @param carId
     */
    void update(int carId);

    /*
     * 全查
     * */
    List<TbCar> queryAll();

    /**
     * 按ID查找车辆信息（更新页面的时候，需要获得页面信息，然后进行更新操作）
     * @param carId
     * @return
     */
    TbCar queryById(int carId);

    /**
     * 查询车辆记录总数
     * @return
     */
    int queryCount();
}
