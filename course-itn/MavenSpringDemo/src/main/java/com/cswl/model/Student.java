/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author PemaSamtenLama
 */
@Entity
@Table(name= "Student_Table")
@NoArgsConstructor
@AllArgsConstructor
public @Data class Student{
        
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name="FirstName")
    private String firstname;
    
    @Column(name="LastName")
    private String lastname;
    
    @Column(name="Image")
    private String image;
    
    @Column(name="Gender")
    private String gender;
    
    @Column(name="Country")
    private String country;
    
    @Column(name="Hobbies")
    private String hobbies;

}
