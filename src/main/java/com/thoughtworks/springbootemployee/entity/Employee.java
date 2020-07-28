package com.thoughtworks.springbootemployee.entity;

public class Employee {

    private int id;
    private String name;
    private int age;
    private String gender;
    private Integer page;
    private Integer pageSize;

    public Employee(int id, String name, int age, String gender, Integer page, Integer pageSize) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.page = page;
        this.pageSize = pageSize;
    }

    public  Employee(){

    }

    public int getId() {
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

    public int getAge() {
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

    public int getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
