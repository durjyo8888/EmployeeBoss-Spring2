package com.example.project1.Controller;

import com.example.project1.Model.Employee;
import com.example.project1.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add-emp")
    public ResponseEntity addEmp(@RequestBody Employee employee){
        Employee emp = employeeService.addEmp(employee);
        return new ResponseEntity(emp, HttpStatus.CREATED);
    }

    @GetMapping("/get-emp")
    public ResponseEntity getEmp(@RequestParam float rating, int age){
        List<Employee> employeeList = employeeService.getEmp(rating,age);
        return new ResponseEntity(employeeList,HttpStatus.FOUND);
    }

    @GetMapping("/count-emp")
    public ResponseEntity countEmp(@RequestParam float rating){
        int count = employeeService.countEmp(rating);
        return new ResponseEntity(count,HttpStatus.FOUND);
    }
}
