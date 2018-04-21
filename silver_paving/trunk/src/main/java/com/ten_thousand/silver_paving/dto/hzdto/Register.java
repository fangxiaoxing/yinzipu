package com.ten_thousand.silver_paving.dto.hzdto;

public class Register {
    private Integer regId;
    private Integer regTelphone;
    private String password;
    private String salt;
    private Integer reginviTelphone;

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public Integer getRegTelphone() {
        return regTelphone;
    }

    public void setRegTelphone(Integer regTelphone) {
        this.regTelphone = regTelphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getReginviTelphone() {
        return reginviTelphone;
    }

    public void setReginviTelphone(Integer reginviTelphone) {
        this.reginviTelphone = reginviTelphone;
    }
}
