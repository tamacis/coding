package aboutme;

import location.MyLocation;
//import location.*;

class Hello {
    public static void main(String args[]) {
        String name = "Dan";
        System.out.println("Hello everybody, my name is " + name);
        
        // location.MyLocation reside = new location.MyLocation();	
        MyLocation reside = new MyLocation();	
        System.out.println("I live in " + reside.whereILive()); 
    }
}