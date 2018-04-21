package com.ten_thousand.silver_paving.service.hz;

import com.ten_thousand.silver_paving.dto.hz.Register;
import java.util.List;

public interface IRegisterService {
    /*
   通过注册电话号码查注册用户
    */
    Register findRegisterByTelphone(Integer tel);

    /*
    通过id查用注册用户
    */
    Register findRegisterById(Integer id);

    /*
    查询所有的注册用户
     */
    List<Register> findAllRegister();

    /*
    新增一个用户
     */
    Integer insertRegister(Register register);

    /*
    删除指定用户的ID
     */
    Integer deleteRegister(int id);

    /*
    根据注册用户id修改
     */
    Integer updateRegisterById(int id);

    /*
    查询用户总数
     */
    Integer getTotalRegisterCount();

    /*
    返回指定页面中的用户列表
    startpage 开始页面
    pagelength 每页大小
     */
    List<Register> findRegisterByPage(int startPage,int pagelength);
}
