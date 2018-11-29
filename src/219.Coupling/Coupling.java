/* Tight Coupling = Bad */

/*
The term tight coupling is used to describe just how much an outside class 
can get its grimy little paws into another class's members. Tight coupling 
is synonomous with a lack of encapsulation and a poorly designed API. 
Consider the following code:
*/

public class TightCoupling {
     public static void main(String args[]) {
         Box b = new Box(5,5,5);
         System.out.println(b.volume);
     }
}
public class Box {
     public int volume;
     Box(int length, int width, int height) {
         this.volume = length * width * height;
     }
}
/*
In the example above, the "tight" in tight coupling means that class A has 
tight (direct) coupling to the instance variable volume in class Box. 

This sort of "tight" coupling is very bad because once the novice programmer 
realizes the ramifications of his mistake and changes volume to private 
and adds a getter method, the tight coupling between A and Box will be broken. 
Just to reiterate - tight coupling is synonomous with a lack of encapsulation 
and a poorly designed API.
*/

/*
Loose Coupling = Good
*/

/*
The term loose coupling is used to describe just how much access an outside class has
 to another class with a well designed API. 
 
 Loose coupling is synonomous with excellent encapsulation and a well-designed API. 
 Consider the following code:
*/

public class LooseCoupling {
     public static void main(String args[]) {
         Box b = new Box(5,5,5);
         System.out.println(b.getVolume());
     }
}
public final class Box {
     private int volume;
     Box(int length, int width, int height) {
         this.volume = length * width * height;
     }
     public int getVolume() { return volume; }
}