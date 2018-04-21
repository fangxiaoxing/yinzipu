package com.ten_thousand.silver_paving.dao.hzdao.impl;

import com.ten_thousand.silver_paving.dao.hzdao.IAdmi;
import com.ten_thousand.silver_paving.dto.hz.Administer;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdmiDAO extends SqlSessionDaoSupport implements IAdmi{
   @Autowired
   public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
       super.setSqlSessionFactory(sqlSessionFactory);
   }
    public Administer checkadmi(String name) {
        Administer admi = getSqlSession().selectOne("com.ten_thousand.silver_paving.dto.hzdto.AdmiMapper.checkadmi", name);
        return admi;
    }

    public List<String> queryRoleByName(String name) {
        List<String> rolename = getSqlSession().selectList("com.ten_thousand.silver_paving.dto.hzdto.AdmiMapper.queryRole", name);
        return rolename;
    }

    @Override
    public List<String> queryPermissionByName(String name) {
        List<String> pername = getSqlSession().selectList("com.ten_thousand.silver_paving.dto.hzdto.AdmiMapper.queryPermission", name);
        return pername;
    }
}
