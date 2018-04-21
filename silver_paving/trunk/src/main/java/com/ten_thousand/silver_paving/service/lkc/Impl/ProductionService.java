package com.ten_thousand.silver_paving.service.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IProductionDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbProduction;
import com.ten_thousand.silver_paving.service.lkc.IProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionService implements IProductionService {
    @Autowired
    private IProductionDAO iProductionDAO;

    public void save(TbProduction production) {
        iProductionDAO.save(production);
    }

    public void delete(int prodId) {
        iProductionDAO.delete(prodId);
    }

    public TbProduction queryById(int prodId) {
        return iProductionDAO.queryById(prodId);
    }

    public void update(int prodId) {
        iProductionDAO.update(prodId);
    }

    public List<TbProduction> queryAll() {
        return iProductionDAO.queryAll();
    }

    public List<TbProduction> queryAllParamsByName(String prodName) {
        return iProductionDAO.queryAllParamsByName(prodName);
    }

    public List<TbProduction> queryProductionMore15() {
        return iProductionDAO.queryProductionMore15();
    }

    public List<TbProduction> queryAllParams() {
        return iProductionDAO.queryAllParams();
    }

    public List<TbProduction> queryProductionNotFull() {
        return iProductionDAO.queryProductionNotFull();
    }

    public List<TbProduction> queryProductionIsFull() {
        return iProductionDAO.queryProductionIsFull();
    }

    public int queryCount() {
        return iProductionDAO.queryCount();
    }

    public List<TbProduction> productionvarge(List<TbProduction> productionList) {
        for (TbProduction production:productionList){
           production.setVarge( production.getProdGivenNum()/production.getProdPrice()*100);
        }
        return productionList;
    }

    @Override
    public List<TbProduction> productionshouyi(List<TbProduction> tbProductionList) {
        for (TbProduction production:tbProductionList){
            production.setShouyi(production.getProdtype().getInterest().getInteUser() / 1200 * (Integer.parseInt(production.getProdtype().getDate().getDateLength()))* 10000);
        }
        return tbProductionList;
    }
}
