package com.ten_thousand.silver_paving.service.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IInterestDAO;
import com.ten_thousand.silver_paving.dao.lkc.IInterestDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbInterest;
import com.ten_thousand.silver_paving.service.lkc.IInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestService implements IInterestService {
    @Autowired
    private IInterestDAO iInterestDAO;

    public void save(TbInterest Interest) {
        iInterestDAO.save(Interest);
    }

    public void delete(int inteId) {
        iInterestDAO.delete(inteId);
    }

    public TbInterest queryById(int inteId) {
        return iInterestDAO.queryById(inteId);
    }

    public void update(int inteId) {
        iInterestDAO.update(inteId);
    }

    public List<TbInterest> queryAll() {
        return iInterestDAO.queryAll();
    }

    public int queryCount() {
        return iInterestDAO.queryCount();
    }
}
