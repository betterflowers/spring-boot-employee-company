package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/employees")
    public List<Employee> getPageList(@RequestParam(required = false) Integer page,
                                      @RequestParam(required = false) Integer pageSize,
                                      @RequestParam(required = false) String gender) {
        if (page == null || pageSize == null) {
            return employeeService.getEmployees();
        }
        if (gender != null) {
            return employeeService.getEmployeeByGender(gender);
        }
        return employeeService.getEmployeeByPageAndPageSize(page, pageSize);
    }


    @PostMapping(path = "/employees")
    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping(path = "/employees/{id}")
    public void updateEmployee(@PathVariable Integer id, Employee employee) {

        employeeService.updateEmployee(id, employee);

    }

    @DeleteMapping(path = "/employees/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployeeById(id);
    }


}
