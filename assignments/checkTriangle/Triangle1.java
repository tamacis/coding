package Java;
import java.util.*;
public class Triangle1 {
    public double area;
    public static double a,b,c;
    public static double sum;
    public void display(){
        System.out.println("Area= "+area);
    }
    public void read(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three sides of triangle: ");
            a=in.nextDouble();
            b=in.nextDouble();
            c=in.nextDouble();
    }
    public void calculate(){
        double s=(a+b+c)/2;
        area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static void main(String[] args){
        Triangle1 ar=new Triangle1();
        ar.read();
        if(a>b || a>c ){
            sum=b+c;
                if(sum>a){
                    ar.calculate();
                    ar.display();
                }
                else{
                     System.out.println("Given sides do not form triangle.");
                }
        }
        else if(b>a || b>c){
            sum=a+c;
                if(sum>b){
                    ar.calculate();
                    ar.display();
                }
                else{
                    System.out.println("Given sides do not form triangle.");
                }
        }
        else if(c>a || c>b){	
            sum=a+b;
                if(sum>c){
                    ar.calculate();
                    ar.display();
                }
                 else{
                    System.out.println("Given sides do not form triangle.");
                 }
        }
       
    }//main ends
}//class ends
