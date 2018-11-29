package Inheri1;
import java.util.Scanner;
public class ManagerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("ENter empID: ");
            int ID = input.nextInt();
        System.out.println("ENter FUllname: ");
            String name = input.nextLine();
        System.out.println("ENter salary: ");
            double sal = input.nextDouble();
        Manager m1 = new Manager();
            m1.setEmpID(ID);
            m1.setFullName(name);
            m1.setSalary(sal);
        
        System.out.println("Employee ID : "+m1.getEmpID());
        System.out.println("Full Name : "+m1.getFullName());
        System.out.println("Salary : "+m1.getSalary());
    }
}
