package com.ten_thousand.silver_paving.dto.lkc;

import java.sql.Timestamp;

public class TbProduction {
    private int prodId;
    private String prodName;
    private String prodCode;
    private Timestamp prodBegin;
    private Timestamp prodEnd;
    private String prodCondition;
    private Double prodPrice;
    private Double prodGivenNum;
    private Double prodFroozenNum;
    private TbProdtype prodtype;
    private TbCar car;
    private TbRisk risk;
    private TbBorrower borrower;
    private Double varge;
    private Double shouyi;

    public Double getShouyi() {
        return shouyi;
    }

    public void setShouyi(Double shouyi) {
        this.shouyi = shouyi;
    }

    public TbBorrower getBorrower() {
        return borrower;
    }

    public void setBorrower(TbBorrower borrower) {
        this.borrower = borrower;
    }

    public Double getVarge() {
        return varge;
    }

    public void setVarge(Double varge) {
        this.varge = varge;
    }

    public TbProdtype getProdtype() {
        return prodtype;
    }

    public void setProdtype(TbProdtype prodtype) {
        this.prodtype = prodtype;
    }

    public TbCar getCar() {
        return car;
    }

    public void setCar(TbCar car) {
        this.car = car;
    }

    public TbRisk getRisk() {
        return risk;
    }

    public void setRisk(TbRisk risk) {
        this.risk = risk;
    }

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

    public Double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Double getProdGivenNum() {
        return prodGivenNum;
    }

    public void setProdGivenNum(Double prodGivenNum) {
        this.prodGivenNum = prodGivenNum;
    }

    public Double getProdFroozenNum() {
        return prodFroozenNum;
    }

    public void setProdFroozenNum(Double prodFroozenNum) {
        this.prodFroozenNum = prodFroozenNum;
    }

    public String getProdCondition() {
        return prodCondition;
    }

    public void setProdCondition(String prodCondition) {
        this.prodCondition = prodCondition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbProduction that = (TbProduction) o;

        if (prodId != that.prodId) return false;
        if (prodName != null ? !prodName.equals(that.prodName) : that.prodName != null) return false;
        if (prodCode != null ? !prodCode.equals(that.prodCode) : that.prodCode != null) return false;
        if (prodBegin != null ? !prodBegin.equals(that.prodBegin) : that.prodBegin != null) return false;
        if (prodEnd != null ? !prodEnd.equals(that.prodEnd) : that.prodEnd != null) return false;
        if (prodCondition != null ? !prodCondition.equals(that.prodCondition) : that.prodCondition != null)
            return false;
        if (prodPrice != null ? !prodPrice.equals(that.prodPrice) : that.prodPrice != null) return false;
        if (prodGivenNum != null ? !prodGivenNum.equals(that.prodGivenNum) : that.prodGivenNum != null) return false;
        if (prodFroozenNum != null ? !prodFroozenNum.equals(that.prodFroozenNum) : that.prodFroozenNum != null)
            return false;
        if (prodtype != null ? !prodtype.equals(that.prodtype) : that.prodtype != null) return false;
        if (car != null ? !car.equals(that.car) : that.car != null) return false;
        if (risk != null ? !risk.equals(that.risk) : that.risk != null) return false;
        if (borrower != null ? !borrower.equals(that.borrower) : that.borrower != null) return false;
        if (varge != null ? !varge.equals(that.varge) : that.varge != null) return false;
        return shouyi != null ? shouyi.equals(that.shouyi) : that.shouyi == null;
    }

    @Override
    public int hashCode() {
        int result = prodId;
        result = 31 * result + (prodName != null ? prodName.hashCode() : 0);
        result = 31 * result + (prodCode != null ? prodCode.hashCode() : 0);
        result = 31 * result + (prodBegin != null ? prodBegin.hashCode() : 0);
        result = 31 * result + (prodEnd != null ? prodEnd.hashCode() : 0);
        result = 31 * result + (prodCondition != null ? prodCondition.hashCode() : 0);
        result = 31 * result + (prodPrice != null ? prodPrice.hashCode() : 0);
        result = 31 * result + (prodGivenNum != null ? prodGivenNum.hashCode() : 0);
        result = 31 * result + (prodFroozenNum != null ? prodFroozenNum.hashCode() : 0);
        result = 31 * result + (prodtype != null ? prodtype.hashCode() : 0);
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (risk != null ? risk.hashCode() : 0);
        result = 31 * result + (borrower != null ? borrower.hashCode() : 0);
        result = 31 * result + (varge != null ? varge.hashCode() : 0);
        result = 31 * result + (shouyi != null ? shouyi.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TbProduction{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodCode='" + prodCode + '\'' +
                ", prodBegin=" + prodBegin +
                ", prodEnd=" + prodEnd +
                ", prodCondition='" + prodCondition + '\'' +
                ", prodPrice=" + prodPrice +
                ", prodGivenNum=" + prodGivenNum +
                ", prodFroozenNum=" + prodFroozenNum +
                ", prodtype=" + prodtype +
                ", car=" + car +
                ", risk=" + risk +
                ", borrower=" + borrower +
                ", varge=" + varge +
                ", shouyi=" + shouyi +
                '}';
    }
}
