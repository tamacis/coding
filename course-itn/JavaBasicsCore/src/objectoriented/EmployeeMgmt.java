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
public class EmployeeMgmt {

    public static void display(Employee e) {
        System.out.println("Id: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Age: " + e.getAge());
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(101);
        emp1.setName("Rahu");
        emp1.setSalary(1600.0f);
        emp1.setAge(24);

        Employee emp2 = new Employee(102, "Sahil", 1800.0f, 25);
        EmployeeMgmt.display(emp1);
        System.out.println();
        EmployeeMgmt.display(emp2);

        Department dep1 = new Department();
        
        dep1.setCode(105);
        dep1.setName("Human Resources");
        dep1.setAddress("Block I");
        dep1.setnEmployees(5);
        
        System.out.println("Code: " + dep1.getCode());
        System.out.println("Name: " + dep1.getName());
        System.out.println("Address: " + dep1.getAddress());
        System.out.println("Number of employee: " + dep1.getnEmployees());


    }
}
