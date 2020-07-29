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

    public Employee getEmployeeById(Integer id){
        for(Employee employee:employeeList){
            if(employee.getId().equals(id)){
                return employee;
            }
        }
        return  null;
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

    public void updateEmployee(Employee employee){
        for (Employee emp:employeeList){
            if(emp.getId().equals(employee.getId())){
                employeeList.remove(emp);
                employeeList.add(employee);
                return;
            }
        }
    }

    public void deleteEmployeeById(Integer id){
        for(Employee employee:employeeList){
            if(employee.getId().equals(id)){
                employeeList.remove(employee);
                return;
            }
        }
    }

}
