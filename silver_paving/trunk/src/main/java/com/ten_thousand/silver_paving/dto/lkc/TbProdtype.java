package com.ten_thousand.silver_paving.dto.lkc;

public class TbProdtype {

    private int prodtypeId;
    private TbInterest interest;
    private TbDate date;
    private TbRefund refund;
    private TbProdintr prodintr;

    public int getProdtypeId() {
        return prodtypeId;
    }

    public void setProdtypeId(int prodtypeId) {
        this.prodtypeId = prodtypeId;
    }

    public TbInterest getInterest() {
        return interest;
    }

    public void setInterest(TbInterest interest) {
        this.interest = interest;
    }

    public TbDate getDate() {
        return date;
    }

    public void setDate(TbDate date) {
        this.date = date;
    }

    public TbRefund getRefund() {
        return refund;
    }

    public void setRefund(TbRefund refund) {
        this.refund = refund;
    }

    public TbProdintr getProdintr() {
        return prodintr;
    }

    public void setProdintr(TbProdintr prodintr) {
        this.prodintr = prodintr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbProdtype that = (TbProdtype) o;

        if (prodtypeId != that.prodtypeId) return false;
        if (interest != null ? !interest.equals(that.interest) : that.interest != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (refund != null ? !refund.equals(that.refund) : that.refund != null) return false;
        return prodintr != null ? prodintr.equals(that.prodintr) : that.prodintr == null;
    }

    @Override
    public int hashCode() {
        int result = prodtypeId;
        result = 31 * result + (interest != null ? interest.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (refund != null ? refund.hashCode() : 0);
        result = 31 * result + (prodintr != null ? prodintr.hashCode() : 0);
        return result;
    }
}
