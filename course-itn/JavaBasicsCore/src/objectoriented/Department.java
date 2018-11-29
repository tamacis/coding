/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

/**
 *
 * @author cswl
 */
public class Department {

    private int code;
    private String name;
    private String address;
    private int nEmployees;

    public Department() {
    }

    public Department(int code, String name, String address, int nEmployees) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.nEmployees = nEmployees;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getnEmployees() {
        return nEmployees;
    }

    public void setnEmployees(int nEmployees) {
        this.nEmployees = nEmployees;
    }
    
    
    
}
