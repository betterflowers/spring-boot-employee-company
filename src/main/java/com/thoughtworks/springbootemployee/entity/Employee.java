package com.thoughtworks.springbootemployee.entity;

public class Employee {

    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Integer page =null;
    private Integer pageSize = null;

    public Employee(Integer id, String name, Integer age, String gender, Integer page, Integer pageSize) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.page = page;
        this.pageSize = pageSize;
    }

    public  Employee(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
