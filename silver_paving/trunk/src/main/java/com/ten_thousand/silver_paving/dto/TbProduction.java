package com.ten_thousand.silver_paving.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class TbProduction implements Serializable{
    private int prodId;
    private String prodName;
    private String prodCode;
    private Timestamp prodBegin;
    private Timestamp prodEnd;
    private String prodCondition;
    private double prodPrice;
    private double prodGivenNum;
    private double prodFroozenNum;
    private double inteUser;
    private String dataLength;

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
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

    public String getProdCondition() {
        return prodCondition;
    }

    public void setProdCondition(String prodCondition) {
        this.prodCondition = prodCondition;
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

    public double getInteUser() {
        return inteUser;
    }

    public void setInteUser(double inteUser) {
        this.inteUser = inteUser;
    }

    public String getDataLength() {
        return dataLength;
    }

    public void setDataLength(String dataLength) {
        this.dataLength = dataLength;
    }
}

