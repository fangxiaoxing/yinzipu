package com.ten_thousand.silver_paving.dao.hzdao;

import com.ten_thousand.silver_paving.dto.hz.Administer;

import java.util.List;

public interface IAdmi {
    //查询管理员姓名
    Administer checkadmi(String name);
    //查询管理员角色名
    List<String> queryRoleByName(String name);
    //查询管理员权限
    List<String> queryPermissionByName(String name);
}
