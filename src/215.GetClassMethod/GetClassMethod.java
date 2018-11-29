import java.lang.reflect.*;
import java.util.*;

enum Silly { ONE, TWO, THREE }

class GetClassMethod {
    public static void main(String args[]) {
        MethodTester.testMe(new Integer(41));
        MethodTester.testMe(new int[2]);
        MethodTester.testMe(new ArrayList());
        MethodTester.testMe("Hello World");
        MethodTester.testMe(Silly.TWO);
        Runnable r = new Runnable() {
        	public void run() {}
        };
        MethodTester.testMe(r);	
    }
}

class MethodTester {
    static void testMe(Object obj) {
        Class c = obj.getClass();
        System.out.println("getSimpleName() = " + c.getSimpleName());
        System.out.println("getName() = " + c.getName());
        System.out.println("toGenericString() = " + c.toGenericString());
        System.out.println("getPackage() = " + c.getPackage());
        System.out.println("getGenericSuperclass() = " + c.getGenericSuperclass().getTypeName());
        if (c.isInterface()) { System.out.println("It is an interface"); }
        if (c.isArray()) { System.out.println("It is an array"); }
        if (c.isEnum()) { System.out.println("It is an enum"); }
        if (c.isAnonymousClass()) { System.out.println("It is an anonymous class"); }

        System.out.println();
        Field fArray[] = c.getDeclaredFields();
        for(Field f : fArray) {
            System.out.println("getDeclaredFields(): " + f.getName());
        }

        Constructor cArray[] = c.getDeclaredConstructors();
        for(Constructor con : cArray) {
            System.out.println("getDeclaredConstructors() = " + con);
        }

        Method mArray[] = c.getDeclaredMethods();
        for(Method m : mArray) {
            System.out.println("getDeclaredMethods(): " + m.getName());
        }
    }
}


