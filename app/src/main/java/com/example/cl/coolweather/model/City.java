package com.example.cl.coolweather.model;

/**
 * Created by cl on 2015/9/1.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", provinceId=" + provinceId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public City(int provinceId, String cityCode, String cityName, int id) {
        this.provinceId = provinceId;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.id = id;
    }

    public City() {

    }
}
