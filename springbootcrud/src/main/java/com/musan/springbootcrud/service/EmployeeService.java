package com.musan.springbootcrud.service;

import com.musan.springbootcrud.model.Employee;
import com.musan.springbootcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //get all products
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


    //get product by id
    public Employee getEmployeeById(String id){
        return employeeRepository.findById(id).orElse(null);
    }


    //add product
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }



//    //update product
    public Employee updateEmployee(String id, Employee employee){
        return employeeRepository.save(employee);


    }


    //delete product
    public void deleteEmployee(String id){
        employeeRepository.deleteById(id);
    }



}
