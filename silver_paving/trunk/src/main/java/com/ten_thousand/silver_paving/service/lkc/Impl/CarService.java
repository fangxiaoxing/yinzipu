package com.ten_thousand.silver_paving.service.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IBorrowerDAO;
import com.ten_thousand.silver_paving.dao.lkc.ICarDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import com.ten_thousand.silver_paving.dto.lkc.TbCar;
import com.ten_thousand.silver_paving.service.lkc.IBorrowerService;
import com.ten_thousand.silver_paving.service.lkc.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {
    @Autowired
    private ICarDAO iCarDAO;

    public void save(TbCar car) {
        iCarDAO.save(car);
    }

    public void delete(int carId) {
        iCarDAO.delete(carId);
    }

    public TbCar queryById(int carId) {
        return iCarDAO.queryById(carId);
    }

    public void update(int carId) {
        iCarDAO.update(carId);
    }

    public List<TbCar> queryAll() {
        return iCarDAO.queryAll();
    }

    public int queryCount() {
        return iCarDAO.queryCount();
    }
}
