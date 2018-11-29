/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.studentmanagement.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author cswl
 */

@NoArgsConstructor
@AllArgsConstructor
public @Data class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String country;
    private String gender;
    private String hobbies;
}
