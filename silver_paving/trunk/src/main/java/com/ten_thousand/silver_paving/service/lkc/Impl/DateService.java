package com.ten_thousand.silver_paving.service.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IDateDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbDate;
import com.ten_thousand.silver_paving.service.lkc.IDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateService implements IDateService {
    @Autowired
    private IDateDAO iDateDAO;

    public void save(TbDate Date) {
        iDateDAO.save(Date);
    }

    public void delete(int dateId) {
        iDateDAO.delete(dateId);
    }

    public TbDate queryById(int dateId) {
        return iDateDAO.queryById(dateId);
    }

    public void update(int dateId) {
        iDateDAO.update(dateId);
    }

    public List<TbDate> queryAll() {
        return iDateDAO.queryAll();
    }

    public int queryCount() {
        return iDateDAO.queryCount();
    }
}
