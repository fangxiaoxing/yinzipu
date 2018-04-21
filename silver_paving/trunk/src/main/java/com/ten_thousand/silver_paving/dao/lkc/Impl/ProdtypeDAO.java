package com.ten_thousand.silver_paving.dao.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IProdtypeDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbDate;
import com.ten_thousand.silver_paving.dto.lkc.TbProdtype;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdtypeDAO extends SqlSessionDaoSupport implements IProdtypeDAO {

    private static Logger logger =Logger.getLogger(BorrowerDAO.class);

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void save(TbProdtype prodtype) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.lkc.TbProdtypeMapper.save", prodtype);
        if(insert==1){
            logger.debug("增添成功");
        }else{
            logger.debug("增添失败");
        }
    }

    public void delete(int prodtypeId) {
        int insert = getSqlSession().delete("com.ten_thousand.silver_paving.dto.lkc.TbProdtypeMapper.delete", prodtypeId);
        if(insert==1){
            logger.debug("删除成功");
        }else{
            logger.debug("删除失败");
        }
    }

    public void update(int prodtypeId) {
        int insert = getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbProdtypeMapper.update", prodtypeId);
        if(insert==1){
            logger.debug("更新成功");
        }else{
            logger.debug("更新失败");
        }
    }


    public List<TbProdtype> queryAll() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbProdtypeMapper.queryAll");
    }

    public TbProdtype queryById(int prodtypeId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbProdtypeMapper.queryById",prodtypeId);
    }

    public int queryCount() {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbProdtypeMapper.queryCount");
    }
}
