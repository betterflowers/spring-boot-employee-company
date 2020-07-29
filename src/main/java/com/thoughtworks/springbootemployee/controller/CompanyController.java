package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping(path = "/companies")
    public List<Company> getCompanyList(){
        return companyService.getCompanyList();
    }

    @GetMapping(path = "/companies/{id}")
    public Company getCompanyById(@PathVariable Integer id) {
        return companyService.getCompanyById(id);
    }

    @PostMapping(path = "/companies")
    public void addCompany(@RequestBody Company company){
        companyService.addCompany(company);
    }


    @PutMapping(path = "/companies/{id}")
    public void updateCompany(@PathVariable Integer id,@RequestBody Company company){
        companyService.updateCompany(id,company);
    }

    @DeleteMapping(path = "/companies/{id}")
    public void deleteCompany(@PathVariable Integer id){
        companyService.deleteCompanyById(id);
    }


    @GetMapping(path = "/companies/{id}/employees")
    public List<Employee> getAllEmployeesOfCompany(@PathVariable Integer id){
        return companyService.getAllEmployeesOfCompany(id);
    }

}
