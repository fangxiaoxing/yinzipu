package com.ten_thousand.silver_paving.service.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IBorrowerDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import com.ten_thousand.silver_paving.service.lkc.IBorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerService implements IBorrowerService {
    @Autowired
    private IBorrowerDAO iBorrowerDAO;

    public void save(TbBorrower borrower) {
        iBorrowerDAO.save(borrower);
    }

    public void delete(int borrId) {
        iBorrowerDAO.delete(borrId);
    }

    public void update(int borrId) {
        iBorrowerDAO.update(borrId);
    }

    public List<TbBorrower> queryAll(){return iBorrowerDAO.queryAll();}

    public TbBorrower queryById(int borrId) {
        return iBorrowerDAO.queryById(borrId);
    }

    public int queryCount() {
        return iBorrowerDAO.queryCount();
    }
}
