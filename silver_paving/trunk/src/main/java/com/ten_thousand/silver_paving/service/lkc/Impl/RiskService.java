package com.ten_thousand.silver_paving.service.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IRiskDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbRisk;
import com.ten_thousand.silver_paving.service.lkc.IRiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskService implements IRiskService {
    @Autowired
    private IRiskDAO iRiskDAO;

    public void save(TbRisk risk) {
        iRiskDAO.save(risk);
    }

    public void delete(int riskId) {
        iRiskDAO.delete(riskId);
    }

    public TbRisk queryById(int riskId) {
        return iRiskDAO.queryById(riskId);
    }

    public void update(int riskId) {
        iRiskDAO.update(riskId);
    }

    public List<TbRisk> queryAll() {
        return iRiskDAO.queryAll();
    }

    public int queryCount() {
        return iRiskDAO.queryCount();
    }
}
