package com.example.cl.coolweather.model;

/**
 * Created by cl on 2015/9/1.
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    @Override
    public String toString() {
        return "County{" +
                "id=" + id +
                ", countyName='" + countyName + '\'' +
                ", countyCode='" + countyCode + '\'' +
                ", cityId=" + cityId +
                '}';
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public County(int cityId, String countyCode, String countyName, int id) {
        this.cityId = cityId;
        this.countyCode = countyCode;
        this.countyName = countyName;
        this.id = id;
    }

    public County() {
    }
}
