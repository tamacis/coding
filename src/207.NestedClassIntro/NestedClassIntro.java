Regular Inner Class, or simply just Inner Class

A regular inner class is defined at the member level and does not have the keyword static in the declaration. By member level I am talking about the same level where instance variables and methods are declared.
class Standard {
     String s = "";
     class Inner {
         int i = 0;
     }
}
Method-Local Inner Class, or just Local Inner Class

A local inner class is defined inside of a method. A local inner class is defined at the same level that local method variables are declared.
class Standard {
     void methodName(String params) {
         String s = "";
         class LocalInner {
             int i = 0;
         }
     }
}
Anonymous Inner Class

An anonymous inner class is a nested class defined without any name. An anonymous class is entirely dependant upon either another class or interface in order to work properly. They typically override a method from an existing class or an interface. The syntax is quite strange so don't waste too much time dwelling on that, I'll go into detail in a separate tutorial.
class HelloWorld {
     void displayMessage() {
         System.out.println("Hello World");
    }
}
class Standard {
     HelloWorld hw = new HelloWorld() {
         void displayMessage() {
             System.out.println("Hello Earth");
         }
     };
}

public interface Runnable {
     void run();
}
class Standard {
     Runnable runnnable = new Runnable() {
         public void run() {
             System.out.println("running");
         }
     };
}
Static Nested Class

A static nested class is defined at the member level and must have the keyword static in the declaration.
class Standard {
     String s = "";
     static class MyClass {
         int i = 0;
     }
}
