package com.ten_thousand.silver_paving.dto.lkc;

public class TbRefund {

    private int refundId;
    private String refundType;

    public int getRefundId() {
        return refundId;
    }

    public void setRefundId(int refundId) {
        this.refundId = refundId;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbRefund tbRefund = (TbRefund) o;

        if (refundId != tbRefund.refundId) return false;
        return refundType != null ? refundType.equals(tbRefund.refundType) : tbRefund.refundType == null;
    }

    @Override
    public int hashCode() {
        int result = refundId;
        result = 31 * result + (refundType != null ? refundType.hashCode() : 0);
        return result;
    }
}
