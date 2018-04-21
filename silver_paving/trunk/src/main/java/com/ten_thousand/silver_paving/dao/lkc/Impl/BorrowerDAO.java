package com.ten_thousand.silver_paving.dao.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IBorrowerDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BorrowerDAO extends SqlSessionDaoSupport implements IBorrowerDAO {

    private static Logger logger =Logger.getLogger(BorrowerDAO.class);

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void save(TbBorrower borrower) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.lkc.TbBorrowerMapper.save", borrower);
        if(insert==1){
            logger.debug("增添成功");
        }else{
            logger.debug("增添失败");
        }
    }

    public void delete(int borrId) {
        int delete = getSqlSession().delete("com.ten_thousand.silver_paving.dto.lkc.TbBorrowerMapper.delete",borrId);
        if(delete==1){
            logger.debug("删除成功");
        }else{
            logger.debug("删除失败");
        }
    }

    public void update(int borrId) {
        int update = getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbBorrowerMapper.update", borrId);
        if(update==1){
            logger.debug("更新成功");
        }else{
            logger.debug("更新失败");
        }
    }

    public List<TbBorrower> queryAll(){
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbBorrowerMapper.queryAll");
    }

    public TbBorrower queryById(int borrId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbBorrowerMapper.queryById",borrId);
    }

    public int queryCount() {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbBorrowerMapper.queryCount");
    }
}
