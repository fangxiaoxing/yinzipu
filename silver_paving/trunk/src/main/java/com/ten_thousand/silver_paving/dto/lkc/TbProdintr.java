package com.ten_thousand.silver_paving.dto.lkc;

public class TbProdintr {
    private int intrId;
    private String intrTxt;

    public int getIntrId() {
        return intrId;
    }

    public void setIntrId(int intrId) {
        this.intrId = intrId;
    }

    public String getIntrTxt() {
        return intrTxt;
    }

    public void setIntrTxt(String intrTxt) {
        this.intrTxt = intrTxt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbProdintr that = (TbProdintr) o;

        if (intrId != that.intrId) return false;
        if (intrTxt != null ? !intrTxt.equals(that.intrTxt) : that.intrTxt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = intrId;
        result = 31 * result + (intrTxt != null ? intrTxt.hashCode() : 0);
        return result;
    }
}
