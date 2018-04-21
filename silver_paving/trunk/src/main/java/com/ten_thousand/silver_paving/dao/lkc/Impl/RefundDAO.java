package com.ten_thousand.silver_paving.dao.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.IRefundDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbDate;
import com.ten_thousand.silver_paving.dto.lkc.TbRefund;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RefundDAO extends SqlSessionDaoSupport implements IRefundDAO {

    private static Logger logger =Logger.getLogger(BorrowerDAO.class);

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void save(TbRefund refund) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.lkc.TbRefundMapper.save", refund);
        if(insert==1){
            logger.debug("增添成功");
        }else{
            logger.debug("增添失败");
        }
    }

    public void delete(int refundId) {
        int insert = getSqlSession().delete("com.ten_thousand.silver_paving.dto.lkc.TbRefundMapper.delete", refundId);
        if(insert==1){
            logger.debug("删除成功");
        }else{
            logger.debug("删除失败");
        }
    }

    public void update(int refundId) {
        int insert = getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbRefundMapper.update", refundId);
        if(insert==1){
            logger.debug("更新成功");
        }else{
            logger.debug("更新失败");
        }
    }

    public List<TbRefund> queryAll() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbRefundMapper.queryAll");
    }

    public TbRefund queryById(int refundId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbRefundMapper.queryById",refundId);
    }

    public int queryCount() {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbRefundMapper.queryCount");
    }
}
