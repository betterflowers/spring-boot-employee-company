package com.thoughtworks.springbootemployee.entity;

import java.util.HashMap;

public class CompanyMapEmployee {

    HashMap<Employee,Company> companyHashMap = new HashMap<>();

    public CompanyMapEmployee(HashMap<Employee, Company> companyHashMap) {
        this.companyHashMap = companyHashMap;
    }

    public HashMap<Employee, Company> getCompanyHashMap() {
        return companyHashMap;
    }

}
