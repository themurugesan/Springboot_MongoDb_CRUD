package com.musan.springbootcrud.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Setter
@Getter
@Document(collection = "EmpoyeeDb")
public class Employee {
    @Id
    private String id;

    private String employeeId;
    private String employeeName;
    private String gender;
    private String designation;
    private String emailId;
    private String MobileNumber;
    private LocalDate dateOfBirth;
    private String city;
    private String address;


}
