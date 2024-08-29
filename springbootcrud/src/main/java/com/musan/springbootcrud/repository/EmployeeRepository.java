package com.musan.springbootcrud.repository;

import com.musan.springbootcrud.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee,String> {


}
