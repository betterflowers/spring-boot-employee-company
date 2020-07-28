package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.CompanyMapEmployee;
import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    private List<Company> companyList;

    public CompanyService() {
        this.companyList = new ArrayList<>();
    }

    public List<Company> getCompanyList(){
        return companyList;
    }

    public Company getCompanyById(Integer id){
        for(Company company:companyList){
            if(company.getId() == id){
                return company;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployeesOfCompany(Integer id){
        Company company = getCompanyById(id);
        return company.getEmployees();
    }

    public List<Company> getCompanyByPageAndPageSize(Integer page, Integer pageSize){

        ArrayList<Company> result =new ArrayList<Company>();

        for(Company company:companyList){
            if(company.getPage() == page &&company.getPageSize()== pageSize){
                result.add(company);
            }
        }
        return result;
    }

    public void addCompany(Company company){
        companyList.add(company);
    }

    public void updateCompany(Integer id,Company company){
        for (Company emp:companyList){
            if(emp.getId() == id){
                companyList.remove(emp);
                companyList.add(company);
                return;
            }
        }
    }

    public void deleteCompanyById(Integer id){
        for(Company company:companyList){
            if(company.getId() == id){
                companyList.remove(company);
                return;
            }
        }
    }


}
