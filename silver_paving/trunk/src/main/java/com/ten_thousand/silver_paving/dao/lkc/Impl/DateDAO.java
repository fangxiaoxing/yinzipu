package com.ten_thousand.silver_paving.dao.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IDateDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbDate;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DateDAO extends SqlSessionDaoSupport implements IDateDAO {

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void save(TbDate date) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.lkc.TbDateMapper.save", date);
        if(insert==1){
            logger.debug("增添成功");
        }else{
            logger.debug("增添失败");
        }
    }

    public void delete(int dateId) {
        int insert = getSqlSession().delete("com.ten_thousand.silver_paving.dto.lkc.TbDateMapper.delete", dateId);
        if(insert==1){
            logger.debug("更新成功");
        }else{
            logger.debug("更新失败");
        }
    }

    public void update(int dateId) {
        int insert = getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbDateMapper.update", dateId);
        if(insert==1){
            logger.debug("删除成功");
        }else{
            logger.debug("删除失败");
        }
    }

    public List<TbDate> queryAll() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbDateMapper.queryAll");
    }

    public TbDate queryById(int dateId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbDateMapper.queryById",dateId);
    }

    public int queryCount() {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbDateMapper.queryCount");
    }
}
