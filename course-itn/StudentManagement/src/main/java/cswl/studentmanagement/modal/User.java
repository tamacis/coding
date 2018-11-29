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
public @Data  class User {
    private int id;
    private String name;
    private String gender;
    private String authority;
    private String image;
}
