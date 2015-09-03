package com.example.cl.coolweather.model;

/**
 * Created by cl on 2015/9/1.
 */
public class Province {

    private int id;

    public Province() {
    }

    public Province(int id, String provinceName, String provinceCode) {

        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceName='" + provinceName + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    private String provinceName;
    private String provinceCode;


}
