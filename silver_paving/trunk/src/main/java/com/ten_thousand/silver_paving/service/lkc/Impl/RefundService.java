package com.ten_thousand.silver_paving.service.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IRefundDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbRefund;
import com.ten_thousand.silver_paving.service.lkc.IRefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefundService implements IRefundService {
    @Autowired
    private IRefundDAO iRefundDAO;

    public void save(TbRefund refund) {
        iRefundDAO.save(refund);
    }

    public void delete(int refundId) {
        iRefundDAO.delete(refundId);
    }

    public TbRefund queryById(int refundId) {
        return iRefundDAO.queryById(refundId);
    }

    public void update(int borrId) {
        iRefundDAO.update(borrId);
    }

    public List<TbRefund> queryAll() {
        return iRefundDAO.queryAll();
    }

    public int queryCount() {
        return iRefundDAO.queryCount();
    }
}
