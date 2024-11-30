package com.mp.pojo;

public class User {
    //    对照数据库
//    id主键
    private Integer id;
//    公司简称
    private String brand_name;
//    公司全名
    private String company_name;
//    排序字段
    private String ordered;
//    描述信息
    private String description;
//    状态：1启用0禁用
    private static Integer status;

    public User() {
    }

    public User(Integer id, String brand_name, String company_name, String ordered, String description, Integer status) {
        this.id = id;
        this.brand_name = brand_name;
        this.company_name = company_name;
        this.ordered = ordered;
        this.description = description;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrdered() {
        return ordered;
    }

    public void setOrdered(String ordered) {
        this.ordered = ordered;
    }

    public static Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", brand_name='" + brand_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", ordered='" + ordered + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
