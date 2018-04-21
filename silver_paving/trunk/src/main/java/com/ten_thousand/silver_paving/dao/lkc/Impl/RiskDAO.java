package com.ten_thousand.silver_paving.dao.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IRiskDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbDate;
import com.ten_thousand.silver_paving.dto.lkc.TbRisk;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RiskDAO extends SqlSessionDaoSupport implements IRiskDAO {

    private static Logger logger =Logger.getLogger(BorrowerDAO.class);

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void save(TbRisk risk) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.lkc.TbRiskMapper.save", risk);
        if(insert==1){
            logger.debug("增添成功");
        }else{
            logger.debug("增添失败");
        }
    }

    public void delete(int riskId) {
        int insert = getSqlSession().delete("com.ten_thousand.silver_paving.dto.lkc.TbRiskMapper.delete", riskId);
        if(insert==1){
            logger.debug("删除成功");
        }else{
            logger.debug("删除失败");
        }
    }

    public void update(int riskId) {
        int insert = getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbRiskMapper.update", riskId);
        if(insert==1){
            logger.debug("更新成功");
        }else{
            logger.debug("更新失败");
        }
    }

    public List<TbRisk> queryAll() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbRiskMapper.queryAll");
    }

    public TbRisk queryById(int riskId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbRiskMapper.queryById",riskId);
    }

    public int queryCount() {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbRiskMapper.queryCount");
    }
}
