package com.ten_thousand.silver_paving.dto;

import java.sql.Timestamp;

public class OrderInfoDto {
        private int prodId;
        private String prodCode;
        private Timestamp prodBegin;
        private Timestamp prodEnd;
//        产品总金额
        private double prodPrice;
//        产品已投金额
        private double prodGivenNum;
//        产品冻结投资金额
        private double prodFroozenNum;
//        产品利率
        private double inteUser;
        private String dataLength;

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public Timestamp getProdBegin() {
        return prodBegin;
    }

    public void setProdBegin(Timestamp prodBegin) {
        this.prodBegin = prodBegin;
    }

    public Timestamp getProdEnd() {
        return prodEnd;
    }

    public void setProdEnd(Timestamp prodEnd) {
        this.prodEnd = prodEnd;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public double getProdGivenNum() {
        return prodGivenNum;
    }

    public void setProdGivenNum(double prodGivenNum) {
        this.prodGivenNum = prodGivenNum;
    }

    public double getProdFroozenNum() {
        return prodFroozenNum;
    }

    public void setProdFroozenNum(double prodFroozenNum) {
        this.prodFroozenNum = prodFroozenNum;
    }

    public double getinteUser() {
        return inteUser;
    }

    public void setinteUser(double inteUser) {
        this.inteUser = inteUser;
    }

    public String getDataLength() {
        return dataLength;
    }

    public void setDataLength(String dataLength) {
        this.dataLength = dataLength;
    }

}
