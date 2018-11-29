package cswl.studentmanagement.modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cswl
 */
@NoArgsConstructor
@AllArgsConstructor
public @Data class Course {
    private int id;
    private String title;
    private int price;
    private String duration;
}

