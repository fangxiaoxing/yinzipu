package com.ten_thousand.silver_paving.realm;

import org.apache.shiro.authc.UsernamePasswordToken;

public class FxUsernamePasswordToken extends UsernamePasswordToken{
    //用来标识是用户登录还是管理员登录
    private String switchType;

    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    public FxUsernamePasswordToken(String username, String password) {
        super(username, password);
    }
}
