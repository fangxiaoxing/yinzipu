package com.ten_thousand.silver_paving.dto.lkc;

import java.sql.Timestamp;

public class TbBorrower {
    private int borrId;
    private String borrName;
    private String borrIdCard;
    private String borrCompany;
    private String borrCompCode;
    private String borrImg1;
    private String borrImg2;
    private String borrImg3;
    private String borrImg4;
    private String borrImg5;
    private String borrImg6;
    private String borrImg7;
    private String borrImg8;
    private String borrImg9;
    private Integer carId;
    private Integer dateId;
    private Timestamp borrBegin;
    private Timestamp borrEnd;

    public Timestamp getBorrBegin() {
        return borrBegin;
    }

    public void setBorrBegin(Timestamp borrBegin) {
        this.borrBegin = borrBegin;
    }

    public Timestamp getBorrEnd() {
        return borrEnd;
    }

    public void setBorrEnd(Timestamp borrEnd) {
        this.borrEnd = borrEnd;
    }

    public int getBorrId() {
        return borrId;
    }

    public void setBorrId(int borrId) {
        this.borrId = borrId;
    }

    public String getBorrName() {
        return borrName;
    }

    public void setBorrName(String borrName) {
        this.borrName = borrName;
    }

    public String getBorrIdCard() {
        return borrIdCard;
    }

    public void setBorrIdCard(String borrIdCard) {
        this.borrIdCard = borrIdCard;
    }

    public String getBorrCompany() {
        return borrCompany;
    }

    public void setBorrCompany(String borrCompany) {
        this.borrCompany = borrCompany;
    }

    public String getBorrCompCode() {
        return borrCompCode;
    }

    public void setBorrCompCode(String borrCompCode) {
        this.borrCompCode = borrCompCode;
    }

    public String getBorrImg1() {
        return borrImg1;
    }

    public void setBorrImg1(String borrImg1) {
        this.borrImg1 = borrImg1;
    }

    public String getBorrImg2() {
        return borrImg2;
    }

    public void setBorrImg2(String borrImg2) {
        this.borrImg2 = borrImg2;
    }

    public String getBorrImg3() {
        return borrImg3;
    }

    public void setBorrImg3(String borrImg3) {
        this.borrImg3 = borrImg3;
    }

    public String getBorrImg4() {
        return borrImg4;
    }

    public void setBorrImg4(String borrImg4) {
        this.borrImg4 = borrImg4;
    }

    public String getBorrImg5() {
        return borrImg5;
    }

    public void setBorrImg5(String borrImg5) {
        this.borrImg5 = borrImg5;
    }

    public String getBorrImg6() {
        return borrImg6;
    }

    public void setBorrImg6(String borrImg6) {
        this.borrImg6 = borrImg6;
    }

    public String getBorrImg7() {
        return borrImg7;
    }

    public void setBorrImg7(String borrImg7) {
        this.borrImg7 = borrImg7;
    }

    public String getBorrImg8() {
        return borrImg8;
    }

    public void setBorrImg8(String borrImg8) {
        this.borrImg8 = borrImg8;
    }

    public String getBorrImg9() {
        return borrImg9;
    }

    public void setBorrImg9(String borrImg9) {
        this.borrImg9 = borrImg9;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getDateId() {
        return dateId;
    }

    public void setDateId(Integer dateId) {
        this.dateId = dateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbBorrower that = (TbBorrower) o;

        if (borrId != that.borrId) return false;
        if (borrName != null ? !borrName.equals(that.borrName) : that.borrName != null) return false;
        if (borrIdCard != null ? !borrIdCard.equals(that.borrIdCard) : that.borrIdCard != null) return false;
        if (borrCompany != null ? !borrCompany.equals(that.borrCompany) : that.borrCompany != null) return false;
        if (borrCompCode != null ? !borrCompCode.equals(that.borrCompCode) : that.borrCompCode != null) return false;
        if (borrImg1 != null ? !borrImg1.equals(that.borrImg1) : that.borrImg1 != null) return false;
        if (borrImg2 != null ? !borrImg2.equals(that.borrImg2) : that.borrImg2 != null) return false;
        if (borrImg3 != null ? !borrImg3.equals(that.borrImg3) : that.borrImg3 != null) return false;
        if (borrImg4 != null ? !borrImg4.equals(that.borrImg4) : that.borrImg4 != null) return false;
        if (borrImg5 != null ? !borrImg5.equals(that.borrImg5) : that.borrImg5 != null) return false;
        if (borrImg6 != null ? !borrImg6.equals(that.borrImg6) : that.borrImg6 != null) return false;
        if (borrImg7 != null ? !borrImg7.equals(that.borrImg7) : that.borrImg7 != null) return false;
        if (borrImg8 != null ? !borrImg8.equals(that.borrImg8) : that.borrImg8 != null) return false;
        if (borrImg9 != null ? !borrImg9.equals(that.borrImg9) : that.borrImg9 != null) return false;
        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;
        if (dateId != null ? !dateId.equals(that.dateId) : that.dateId != null) return false;
        if (borrBegin != null ? !borrBegin.equals(that.borrBegin) : that.borrBegin != null) return false;
        return borrEnd != null ? borrEnd.equals(that.borrEnd) : that.borrEnd == null;
    }

    @Override
    public int hashCode() {
        int result = borrId;
        result = 31 * result + (borrName != null ? borrName.hashCode() : 0);
        result = 31 * result + (borrIdCard != null ? borrIdCard.hashCode() : 0);
        result = 31 * result + (borrCompany != null ? borrCompany.hashCode() : 0);
        result = 31 * result + (borrCompCode != null ? borrCompCode.hashCode() : 0);
        result = 31 * result + (borrImg1 != null ? borrImg1.hashCode() : 0);
        result = 31 * result + (borrImg2 != null ? borrImg2.hashCode() : 0);
        result = 31 * result + (borrImg3 != null ? borrImg3.hashCode() : 0);
        result = 31 * result + (borrImg4 != null ? borrImg4.hashCode() : 0);
        result = 31 * result + (borrImg5 != null ? borrImg5.hashCode() : 0);
        result = 31 * result + (borrImg6 != null ? borrImg6.hashCode() : 0);
        result = 31 * result + (borrImg7 != null ? borrImg7.hashCode() : 0);
        result = 31 * result + (borrImg8 != null ? borrImg8.hashCode() : 0);
        result = 31 * result + (borrImg9 != null ? borrImg9.hashCode() : 0);
        result = 31 * result + (carId != null ? carId.hashCode() : 0);
        result = 31 * result + (dateId != null ? dateId.hashCode() : 0);
        result = 31 * result + (borrBegin != null ? borrBegin.hashCode() : 0);
        result = 31 * result + (borrEnd != null ? borrEnd.hashCode() : 0);
        return result;
    }
}
