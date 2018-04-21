package com.ten_thousand.silver_paving.dao.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IProductionDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbProduction;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductionDAO extends SqlSessionDaoSupport implements IProductionDAO {

    private static Logger logger =Logger.getLogger(BorrowerDAO.class);

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void save(TbProduction production) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.save", production);
        if(insert==1){
            logger.debug("增添成功");
        }else{
            logger.debug("增添失败");
        }
    }

    public void delete(int prodId) {
        int insert = getSqlSession().delete("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.delete", prodId);
        if(insert==1){
            logger.debug("删除成功");
        }else{
            logger.debug("删除失败");
        }
    }

    public void update(int prodId) {
        int insert = getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.update", prodId);
        if(insert==1){
            logger.debug("更新成功");
        }else{
            logger.debug("更新失败");
        }
    }


    public List<TbProduction> queryAll() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryAll");
    }

    public List<TbProduction> queryProductionMore15() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryProductionMore15");
    }

    public List<TbProduction> queryAllParams() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryAllParams");
    }


    public List<TbProduction> queryAllParamsByName(String prodName) {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryAllParamsByName",prodName);
    }


    public List<TbProduction> queryProductionNotFull() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryProductionNotFull");
    }


    public List<TbProduction> queryProductionIsFull() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryProductionIsFull");
    }

    public TbProduction queryById(int prodId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryById",prodId);
    }

    public int queryCount() {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbProductionMapper.queryCount");
    }
}
