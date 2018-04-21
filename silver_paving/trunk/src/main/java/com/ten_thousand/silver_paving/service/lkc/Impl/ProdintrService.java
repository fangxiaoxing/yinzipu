package com.ten_thousand.silver_paving.service.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IBorrowerDAO;
import com.ten_thousand.silver_paving.dao.lkc.IProdintrDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import com.ten_thousand.silver_paving.dto.lkc.TbInterest;
import com.ten_thousand.silver_paving.dto.lkc.TbProdintr;
import com.ten_thousand.silver_paving.service.lkc.IBorrowerService;
import com.ten_thousand.silver_paving.service.lkc.IProdintrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdintrService implements IProdintrService {
    @Autowired
    private IProdintrDAO iProdintrDAO;

    public void save(TbProdintr prodintr) {
        iProdintrDAO.save(prodintr);
    }

    public void delete(int prodintrId) {
        iProdintrDAO.delete(prodintrId);
    }

    public TbProdintr queryById(int prodintrId) {
        return iProdintrDAO.queryById(prodintrId);
    }

    public void update(int borrId) {
        iProdintrDAO.update(borrId);
    }

    @Override
    public List<TbProdintr> queryAll() {
        return iProdintrDAO.queryAll();
    }

    public int queryCount() {
        return iProdintrDAO.queryCount();
    }
}
