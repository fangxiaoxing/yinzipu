package com.ten_thousand.silver_paving.dto.hz;

import java.io.Serializable;

public class Administer implements Serializable{

    private Integer  admiId;
    private String admiUserName;
    private String admiPassword;
    private String Salt;

    public int getAdmiId() {
        return admiId;
    }

    public void setAdmiId(int admiId) {
        this.admiId = admiId;
    }

    public String getAdmiUserName() {
        return admiUserName;
    }

    public void setAdmiUserName(String admiUserName) {
        this.admiUserName = admiUserName;
    }

    public String getAdmiPassword() {
        return admiPassword;
    }

    public void setAdmiPassword(String admiPassword) {
        this.admiPassword = admiPassword;
    }

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String salt) {
        Salt = salt;
    }


}
