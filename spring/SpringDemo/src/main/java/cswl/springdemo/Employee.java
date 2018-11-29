/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.springdemo;

import lombok.Data;

/**
 *
 * @author cswl
 */


public @Data
class Employee {
    int eid;
    String ename;
    String address;
    char gender;

    public void onInit() {
        System.out.println("Object created.");
    }

    public void onDestroy() {
        System.out.println("Object destroyed.");
    }
}
