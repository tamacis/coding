package Inheri1;
public class Employee {
    private int empID;
    private String fullName;
    private double salary;
   
    //getters and setters
    public int getEmpID(){
        return empID;
    }
    public void setEmpID(int empID){
        this.empID = empID;
    }
    
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    //constructor
    public Employee(int empID, String fullName, double salary) {
        this.empID = empID;
        this.fullName = fullName;
        this.salary = salary;
    }
    //default constructor
    public Employee(){
        empID = 0;
        fullName = " ";
        salary = 0.0;
    }
    
    //method
    public void raiseSalary(){
        double amt = 0.0;
        amt = amt + salary;
    }
}
