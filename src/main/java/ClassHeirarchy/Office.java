
import java.util.Scanner;

public class Office {
    private int officeID;
    private String branchLocation;
    private double phone;
    private String email;
    
    public Office(){
        officeID= 0;
        branchLocation=" ";
        phone=0.0;
        email=" ";
    }
    
    //getters and setters
    public int getOfficeID(){
        return officeID;
    }
    public void setOfficeID(int officeID){
        this.officeID = officeID;
    }

    public String getBranchLocation() {
        return branchLocation;
    }
    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public double getPhone() {
        return phone;
    }
    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    //constructors

    public Office(int officeID, String branchLocation, double phone, String email) {
        this.officeID=officeID;
        this.branchLocation=branchLocation;
        this.phone=phone;
        this.email=email;
    }
    
    
    //main
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter office Id : ");
            int ID = in.nextInt();
        System.out.println(" Enter Phone no.: ");
            double ph = in.nextDouble();
        System.out.println(" Enter Branch Location: ");
            String location = in.nextLine();
        System.out.println(" Enter Email Address: ");
            String mail = in.nextLine();
            
        Office o1=new Office();
            o1.setOfficeID(ID);
            o1.setBranchLocation(location);
            o1.setPhone(ph);
            o1.setEmail(mail);
            
        System.out.println("OfficeID = "+o1.getOfficeID());
        System.out.println("Branch Location = "+o1.getBranchLocation());
        System.out.println("Phone = "+o1.getPhone());
        System.out.println("Email = "+o1.getEmail());
    }
}
