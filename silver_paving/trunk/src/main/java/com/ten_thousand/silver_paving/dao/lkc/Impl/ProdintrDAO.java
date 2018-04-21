package com.ten_thousand.silver_paving.dao.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IProdintrDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbDate;
import com.ten_thousand.silver_paving.dto.lkc.TbProdintr;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdintrDAO extends SqlSessionDaoSupport implements IProdintrDAO {

    private static Logger logger =Logger.getLogger(BorrowerDAO.class);

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void save(TbProdintr prodintr) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.lkc.TbProdintrMapper.save", prodintr);
        if(insert==1){
            logger.debug("增添成功");
        }else{
            logger.debug("增添失败");
        }
    }

    public void delete(int prodintrId) {
        int insert = getSqlSession().delete("com.ten_thousand.silver_paving.dto.lkc.TbProdintrMapper.delete", prodintrId);
        if(insert==1){
            logger.debug("删除成功");
        }else{
            logger.debug("删除失败");
        }
    }

    public void update(int prodintrId) {
        int insert = getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbProdintrMapper.update", prodintrId);
        if(insert==1){
            logger.debug("更新成功");
        }else{
            logger.debug("更新失败");
        }
    }


    public List<TbProdintr> queryAll() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbProdintrMapper.queryAll");
    }

    public TbProdintr queryById(int prodintrId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbProdintrMapper.queryById",prodintrId);
    }

    public int queryCount() {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbProdintrMapper.queryCount");
    }
}
