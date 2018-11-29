package Inheri1;
public class Manager extends Employee{
    private String branch;
    
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }   
    
    public Manager(){
        branch = " ";
    }
    public Manager(String branch){
        this.branch = branch;
    }
}
