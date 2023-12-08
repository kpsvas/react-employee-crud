package com.employeecrudexample.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
/*These annotations help us to map our domain objects (POJOs)
 to the relational database table*/
@Table(name="employee")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;

        @Column(name="first_name")
        private String firstName;

        @Column(name="last_name")
        private String lastName;

        @Column(name="email_id")
        private String emailId;

    /*@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long employeeId;

    @Column(nullable = false)
    private  String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String emailId;*/


}
