package com.ten_thousand.silver_paving.dao.lkc.Impl;

import com.ten_thousand.silver_paving.dao.lkc.ICarDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbCar;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDAO extends SqlSessionDaoSupport implements ICarDAO {
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void save(TbCar car) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.lkc.TbCarMapper.save", car);
        if(insert==1){
            logger.debug("增添成功");
        }else{
            logger.debug("增添失败");
        }
    }

    public void delete(int carId) {
        int insert = getSqlSession().delete("com.ten_thousand.silver_paving.dto.lkc.TbCarMapper.delete", carId);
        if(insert==1){
            logger.debug("删除成功");
        }else{
            logger.debug("删除失败");
        }
    }

    public void update(int carId) {
        int insert = getSqlSession().update("com.ten_thousand.silver_paving.dto.lkc.TbCarMapper.update", carId);
        if(insert==1){
            logger.debug("更新成功");
        }else{
            logger.debug("更新失败");
        }
    }

    public List<TbCar> queryAll() {
        return getSqlSession().selectList("com.ten_thousand.silver_paving.dto.lkc.TbCarMapper.queryAll");
    }

    public TbCar queryById(int carId) {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbCarMapper.queryById",carId);
    }

    public int queryCount() {
        return getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.lkc.TbCarMapper.queryCount");
    }
}
