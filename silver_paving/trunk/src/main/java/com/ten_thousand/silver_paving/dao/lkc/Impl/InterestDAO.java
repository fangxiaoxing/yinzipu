package com.ten_thousand.silver_paving.dao.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IInterestDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbDate;
import com.ten_thousand.silver_paving.dto.lkc.TbInterest;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InterestDAO extends SqlSessionDaoSupport implements IInterestDAO {

    private static Logger logger =Logger.getLogger(BorrowerDAO.class);

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void save(TbInterest interest) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.lkc.TbInterestMapper.save", interest);
        if(insert==1){
            logger.debug("增添成功");
        }else{
            logger.debug("增添失败");
        }
    }

    public void delete(int inteId) {
        int insert = getSqlSession().delete("com.ten_thousand.silver_paving.dto.lkc.TbInterestMapper.delete", inteId);
        if(insert==1){
            logger.debug("删除成功");
        }else{
            logger.debug("删除失败");
        }
    }

    public void update(int inteId) {
        int insert = getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbInterestMapper.update", inteId);
        if(insert==1){
            logger.debug("更新成功");
        }else{
            logger.debug("更新失败");
        }
    }

    public List<TbInterest> queryAll() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbInterestMapper.queryAll");
    }

    public TbInterest queryById(int inteId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbInterestMapper.queryById",inteId);
    }

    public int queryCount() {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbInterestMapper.queryCount");
    }
}
