package com.ten_thousand.silver_paving.service.hz.Impl;

import com.ten_thousand.silver_paving.cache.IsliveryCache;
import com.ten_thousand.silver_paving.dao.hzdao.IRegister;
import com.ten_thousand.silver_paving.dto.hz.Register;
import com.ten_thousand.silver_paving.service.hz.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegisterService implements IRegisterService{
    @Autowired
    private IRegister registerdao;

    @Autowired
    private IsliveryCache cache;

    public Register findRegisterByTelphone(String tel) {
        return registerdao.findRegisterByTelphone(tel);
    }

    @Override
    public Register findRegisterByTelphone(Integer tel) {
        return null;
    }

    public Register findRegisterById(Integer id) {
        return registerdao.findRegisterById(id);
    }

    public List<Register> findAllRegister() {
        return registerdao.findAllRegister();
    }

    public Integer insertRegister(Register register) {
        return registerdao.insertRegister(register);
    }

    public Integer deleteRegister(int id) {
        return registerdao.deleteRegister(id);
    }

    public Integer updateRegisterById(int id) {
        return registerdao.updateRegisterById(id);
    }

    public Integer getTotalRegisterCount() {
        return registerdao.getTotalRegisterCount();
    }

    public List<Register> findRegisterByPage(int startPage, int pagelength) {
        return null;
    }
}
