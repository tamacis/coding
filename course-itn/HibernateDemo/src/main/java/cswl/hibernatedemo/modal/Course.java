/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.hibernatedemo.modal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name = "course_tbl")
@NoArgsConstructor
@AllArgsConstructor
public @Data
class Course implements Serializable {
    private static final long serialVersionUID = 123566L;
    @Id @GeneratedValue @Column(name="cid") 
    private int id;
    @Column(name="ctitle") private String title;
    @Column(name="cprice") private double price;
    @Column(name="cduration") private String duration;
}
