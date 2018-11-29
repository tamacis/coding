/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cswl.model;

import java.io.Serializable;
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
 * @author cswl
 */
@Entity
@Table(name = "User_Role")
@NoArgsConstructor
@AllArgsConstructor
public @Data
class UserRole implements Serializable {

    private static final long serialVersionUID = 2904280L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int uid;
    private String authority;
}
