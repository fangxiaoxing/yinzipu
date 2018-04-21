package com.ten_thousand.silver_paving.dto.lkc;

public class TbInterest {
    private int inteId;
    private Double inteComp;
    private Double inteUser;

    public int getInteId() {
        return inteId;
    }

    public void setInteId(int inteId) {
        this.inteId = inteId;
    }

    public Double getInteComp() {
        return inteComp;
    }

    public void setInteComp(Double inteComp) {
        this.inteComp = inteComp;
    }

    public Double getInteUser() {
        return inteUser;
    }

    public void setInteUser(Double inteUser) {
        this.inteUser = inteUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbInterest that = (TbInterest) o;

        if (inteId != that.inteId) return false;
        if (inteComp != null ? !inteComp.equals(that.inteComp) : that.inteComp != null) return false;
        return inteUser != null ? inteUser.equals(that.inteUser) : that.inteUser == null;
    }

    @Override
    public int hashCode() {
        int result = inteId;
        result = 31 * result + (inteComp != null ? inteComp.hashCode() : 0);
        result = 31 * result + (inteUser != null ? inteUser.hashCode() : 0);
        return result;
    }
}
