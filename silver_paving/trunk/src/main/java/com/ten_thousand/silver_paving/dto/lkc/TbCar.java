package com.ten_thousand.silver_paving.dto.lkc;

public class TbCar {
    private int carId;
    private String carBrand;
    private String carVersion;
    private String carType;
    private String carNumber;
    private String carDate;
    private Double carPrice;
    private String carCode;
    private String carImg1;
    private String carImg2;
    private String carImg3;
    private String carImg4;
    private String carCondition;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarVersion() {
        return carVersion;
    }

    public void setCarVersion(String carVersion) {
        this.carVersion = carVersion;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarDate() {
        return carDate;
    }

    public void setCarDate(String carDate) {
        this.carDate = carDate;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public String getCarImg1() {
        return carImg1;
    }

    public void setCarImg1(String carImg1) {
        this.carImg1 = carImg1;
    }

    public String getCarImg2() {
        return carImg2;
    }

    public void setCarImg2(String carImg2) {
        this.carImg2 = carImg2;
    }

    public String getCarImg3() {
        return carImg3;
    }

    public void setCarImg3(String carImg3) {
        this.carImg3 = carImg3;
    }

    public String getCarImg4() {
        return carImg4;
    }

    public void setCarImg4(String carImg4) {
        this.carImg4 = carImg4;
    }

    public String getCarCondition() {
        return carCondition;
    }

    public void setCarCondition(String carCondition) {
        this.carCondition = carCondition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCar tbCar = (TbCar) o;

        if (carId != tbCar.carId) return false;
        if (carBrand != null ? !carBrand.equals(tbCar.carBrand) : tbCar.carBrand != null) return false;
        if (carVersion != null ? !carVersion.equals(tbCar.carVersion) : tbCar.carVersion != null) return false;
        if (carType != null ? !carType.equals(tbCar.carType) : tbCar.carType != null) return false;
        if (carNumber != null ? !carNumber.equals(tbCar.carNumber) : tbCar.carNumber != null) return false;
        if (carDate != null ? !carDate.equals(tbCar.carDate) : tbCar.carDate != null) return false;
        if (carPrice != null ? !carPrice.equals(tbCar.carPrice) : tbCar.carPrice != null) return false;
        if (carCode != null ? !carCode.equals(tbCar.carCode) : tbCar.carCode != null) return false;
        if (carImg1 != null ? !carImg1.equals(tbCar.carImg1) : tbCar.carImg1 != null) return false;
        if (carImg2 != null ? !carImg2.equals(tbCar.carImg2) : tbCar.carImg2 != null) return false;
        if (carImg3 != null ? !carImg3.equals(tbCar.carImg3) : tbCar.carImg3 != null) return false;
        if (carImg4 != null ? !carImg4.equals(tbCar.carImg4) : tbCar.carImg4 != null) return false;
        if (carCondition != null ? !carCondition.equals(tbCar.carCondition) : tbCar.carCondition != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carId;
        result = 31 * result + (carBrand != null ? carBrand.hashCode() : 0);
        result = 31 * result + (carVersion != null ? carVersion.hashCode() : 0);
        result = 31 * result + (carType != null ? carType.hashCode() : 0);
        result = 31 * result + (carNumber != null ? carNumber.hashCode() : 0);
        result = 31 * result + (carDate != null ? carDate.hashCode() : 0);
        result = 31 * result + (carPrice != null ? carPrice.hashCode() : 0);
        result = 31 * result + (carCode != null ? carCode.hashCode() : 0);
        result = 31 * result + (carImg1 != null ? carImg1.hashCode() : 0);
        result = 31 * result + (carImg2 != null ? carImg2.hashCode() : 0);
        result = 31 * result + (carImg3 != null ? carImg3.hashCode() : 0);
        result = 31 * result + (carImg4 != null ? carImg4.hashCode() : 0);
        result = 31 * result + (carCondition != null ? carCondition.hashCode() : 0);
        return result;
    }
}
