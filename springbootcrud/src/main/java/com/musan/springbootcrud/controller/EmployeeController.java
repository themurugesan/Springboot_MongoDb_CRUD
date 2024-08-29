package com.musan.springbootcrud.controller;

import com.musan.springbootcrud.model.Employee;
import com.musan.springbootcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //get all products
    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
//    get product by Id
    @GetMapping("/details/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return employeeService.getEmployeeById(id);
    }

    //add product
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);
    }
//
    //update product
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    //delete product
    @DeleteMapping("delete/{id}")
    public  String deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
        return "Product delete with id   "+ id;
    }


}
