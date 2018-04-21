package com.ten_thousand.silver_paving.dto.lkc;

public class TbDate {

    private int dateId;
    private String dateLength;

    public int getDateId() {
        return dateId;
    }

    public void setDateId(int dateId) {
        this.dateId = dateId;
    }

    public String getDateLength() {
        return dateLength;
    }

    public void setDateLength(String dateLength) {
        this.dateLength = dateLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbDate tbDate = (TbDate) o;

        if (dateId != tbDate.dateId) return false;
        return dateLength != null ? dateLength.equals(tbDate.dateLength) : tbDate.dateLength == null;
    }

    @Override
    public int hashCode() {
        int result = dateId;
        result = 31 * result + (dateLength != null ? dateLength.hashCode() : 0);
        return result;
    }
}
