package com.example.project1.Service;

import com.example.project1.Model.Employee;
import com.example.project1.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmp(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmp(float rating, int age) {
        List<Employee> employeeList = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();

        for(Employee currEmployee : employeeList){
            if(currEmployee.getRating() == rating && currEmployee.getAge() == age){
                employees.add(currEmployee);
            }
        }
        return employees;
    }

    public int countEmp(float rating) {

        int count = 0;
        List<Employee> employeeList = employeeRepository.findAll();
        for(Employee currEmployee : employeeList){
            if(currEmployee.getBossRating() > rating && currEmployee.getRating() > rating){
                count++;
            }
        }
        return count;
    }
}
