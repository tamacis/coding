/*
  *  A static method cannot directly access a non-static instance variable. 
  *     An instance variable can only be accessed inside of a static method by reference.
  *  A static method can directly access a static class variable from within the same class.
  *  A static method can directly access a static class variable from another class.
  *  A static method cannot directly invoke a non-static method from within the same class. 
          A non-static method can only be invoked by reference.
  *  A static method can directly invoke a static method from within the same class.
  *  A static method can directly invoke a static method from another class.
  *  A static method cannot use the this keyword.
*/

class StaticMethodOne {
    int instanceInt = 0; // non-static instance variable
    static int staticInt = 0; // static class variable

    public static void main(String args[]) {
        // instanceInt = 10; // no! A static method cannot directly access a non-static instance variable
        StaticMethodOne smo = new StaticMethodOne();
        smo.instanceInt = 10; // only access via reference
        System.out.println("Non-static instanceInt value via reference = " + smo.instanceInt);
        
        /////
        staticInt = 20; // yes! A static method can directly access a static class variable from the same class.
        System.out.println("Static staticInt = " + staticInt);

        /////
        OtherClass.sharedInt = 41; // yes! A static method can directly access a static class variable from another class
        System.out.println("Static sharedInt from OtherClass = " + OtherClass.sharedInt);

        /////
        // nonStaticMethod(); // no! A static method cannot directly invoke a non-static method
        smo.nonStaticMethod(); // only invoke via reference

        /////
        staticMethod(); // A static method can directly invoke a static method from within the same class.
		
        /////
        OtherClass.otherStaticMethod(); // A static method can directly invoke a static method from another class.

        // this.staticMethod(); // cannot use the this keyword.
        // this.nonStaticMethod(); // cannot use the this keyword.
        // this.instanceInt = 6; // cannot use the this keyword.
        // this.staticInt = 5; // cannot use the this keyword.

    }
    void nonStaticMethod () { 
        System.out.println("nonStaticMethod invoked using reference"); 
    }

    static void staticMethod () { 
        System.out.println("staticMethod invoked directly"); 
    }
}
class OtherClass {
    static int sharedInt = 0;

    static void otherStaticMethod() {
        System.out.println("OtherClass.otherStaticMethod invoked directly");
    }
}