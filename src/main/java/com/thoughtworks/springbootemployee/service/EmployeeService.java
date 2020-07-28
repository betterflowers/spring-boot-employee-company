package com.thoughtworks.springbootemployee.service;


import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList;

    public EmployeeService() {
        this.employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployees(){
        return employeeList;
    }

    public Employee getEmployeeById(int id){
        for(Employee employee:employeeList){
            if(employee.getId() == id){
                return employee;
            }
        }
        return  null;
    }

    public List<Employee> getEmployeeByPageAndPageSize(Integer page,Integer pageSize){

        ArrayList<Employee> result =new ArrayList<Employee>();

        for(Employee employee:employeeList){
            if(employee.getPage() == page && employee.getPageSize()== pageSize){
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> getEmployeeByGender(String gender){

        ArrayList<Employee> result =new ArrayList<Employee>();

        for(Employee employee:employeeList){
            if(employee.getGender().equals(gender)){
                result.add(employee);

            }
        }
        return result;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void updateEmployee(int id,Employee employee){
        for (Employee emp:employeeList){
            if(emp.getId() == id){
                employeeList.remove(emp);
                employeeList.add(employee);
                return;
            }
        }
    }

    public void deleteEmployeeById(int id){
        for(Employee employee:employeeList){
            if(employee.getId() == id){
                employeeList.remove(employee);
                return;
            }
        }
    }

}
