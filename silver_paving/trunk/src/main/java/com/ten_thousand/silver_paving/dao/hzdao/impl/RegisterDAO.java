package com.ten_thousand.silver_paving.dao.hzdao.impl;

import com.ten_thousand.silver_paving.dao.hzdao.IRegister;
import com.ten_thousand.silver_paving.dto.hz.Register;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class RegisterDAO extends SqlSessionDaoSupport implements IRegister{
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public Register findRegisterByTelphone(String tel) {
        Register register = getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.hzdto.RegisterMapper.checkregister", tel);
        return register;
    }

    @Override
    public Register findRegisterById(Integer id) {
        return null;
    }

    @Override
    public List<Register> findAllRegister() {
        List<Register> registerListlist = getSqlSession().selectList("com.ten_thousand.silver_paving.dto.hzdto.RegisterMapper.findAllRegister");
        return registerListlist;
    }

    @Override
    public Integer insertRegister(Register register) {
        int insert = getSqlSession().insert("com.ten_thousand.silver_paving.dto.hzdto.RegisterMapper.insertRegister");
        return insert;
    }

    @Override
    public Integer deleteRegister(int id) {
        int delete = getSqlSession().delete("com.ten_thousand.silver_paving.dto.hzdto.RegisterMapper.deleteRegister");
        return delete;
    }

    @Override
    public Integer updateRegisterById(int id) {
        int update = getSqlSession().update("com.ten_thousand.silver_paving.dto.hzdto.RegisterMapper.updateRegisterById");
        return update;
    }

    @Override
    public Integer getTotalRegisterCount() {
        int count = getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.hzdto.RegisterMapper.querycount");
        return count;
    }

    @Override
    public List<Register> findRegisterByPage(int startPage, int pagelength) {
        return null;
    }
}
