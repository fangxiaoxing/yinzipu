package com.ten_thousand.silver_paving.dto.lkc;

public class TbRisk {
    private int riskId;
    private String riskCheck;
    private String riskConclusion;

    public int getRiskId() {
        return riskId;
    }

    public void setRiskId(int riskId) {
        this.riskId = riskId;
    }

    public String getRiskCheck() {
        return riskCheck;
    }

    public void setRiskCheck(String riskCheck) {
        this.riskCheck = riskCheck;
    }

    public String getRiskConclusion() {
        return riskConclusion;
    }

    public void setRiskConclusion(String riskConclusion) {
        this.riskConclusion = riskConclusion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbRisk tbRisk = (TbRisk) o;

        if (riskId != tbRisk.riskId) return false;
        if (riskCheck != null ? !riskCheck.equals(tbRisk.riskCheck) : tbRisk.riskCheck != null) return false;
        if (riskConclusion != null ? !riskConclusion.equals(tbRisk.riskConclusion) : tbRisk.riskConclusion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = riskId;
        result = 31 * result + (riskCheck != null ? riskCheck.hashCode() : 0);
        result = 31 * result + (riskConclusion != null ? riskConclusion.hashCode() : 0);
        return result;
    }
}
