package com.ten_thousand.silver_paving.service.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IProdtypeDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbProdtype;
import com.ten_thousand.silver_paving.service.lkc.IProdtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdtypeService implements IProdtypeService {
    @Autowired
    private IProdtypeDAO iProdtypeDAO;

    public void save(TbProdtype prodtype) {
        iProdtypeDAO.save(prodtype);
    }

    public void delete(int prodtypeId) {
        iProdtypeDAO.delete(prodtypeId);
    }

    public TbProdtype queryById(int prodtypeId) {
        return iProdtypeDAO.queryById(prodtypeId);
    }

    public void update(int prodtypeId) {
        iProdtypeDAO.update(prodtypeId);
    }

    public List<TbProdtype> queryAll() {
        return iProdtypeDAO.queryAll();
    }

    public int queryCount() {
        return iProdtypeDAO.queryCount();
    }
}
