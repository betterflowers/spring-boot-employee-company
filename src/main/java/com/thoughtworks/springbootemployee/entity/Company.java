package com.thoughtworks.springbootemployee.entity;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private Integer id;
    private String name;
    private Integer page;
    private Integer pageSize = null;
    private List<Employee> employees = null;

    public Company(Integer id, String name, Integer page, Integer pageSize) {
        this.id = id;
        this.name = name;
        this.page = page;
        this.pageSize = pageSize;
    }
    public Company(){
        this.employees = new ArrayList<>();

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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
