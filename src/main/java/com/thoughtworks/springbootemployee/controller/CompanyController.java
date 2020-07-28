package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    private CompanyService companyService;

    @GetMapping(path = "/companies/{id}")
    public Company getCompanyById(@PathVariable int id) {
        return companyService.getCompanyById(id);
    }

    @PostMapping(path = "/companies")
    public void addCompany(Company company){
        companyService.addCompany(company);
    }

    @PutMapping(path = "/companies/{id}")
    public void updateCompany(@PathVariable int id, Company company){
        companyService.updateCompany(id,company);
    }

    @DeleteMapping(path = "/companies/{id}")
    public void deleteCompany(@PathVariable int id){
        companyService.deleteCompanyById(id);
    }

    @GetMapping(path = "/companies")
    public List<Company> getCompanyList(@RequestParam(required = false) Integer page,
                                      @RequestParam(required = false) Integer pageSize){
        if (page == null || pageSize == null) {
            return companyService.getCompanyList();
        }
        return companyService.getCompanyByPageAndPageSize(page, pageSize);
    }

    @GetMapping(path = "/companies/{id}/employees")
    public List<Employee> getAllEmployeesOfCompany(int id){
        return companyService.getAllEmployeesOfCompany(id);
    }

}
