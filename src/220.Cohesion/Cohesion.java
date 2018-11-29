import java.lang.reflect.*;
import java.util.*;
class Tester {
    public static void main(String args[]) {
        Integer i = new Integer(41);	
        String s = "Hello World";

        ObjectInformation oi = new ObjectInformation();
        System.out.println("i information...");
        System.out.println(oi.getObjectClassName(i));
        System.out.println(oi.getObjectSuperclassName(i));
        oi.getObjectFields(i).forEach(x -> System.out.println("Field: " + x));
        oi.getObjectConstructors(i).forEach(x -> System.out.println("Constructor: " + x));
        oi.getObjectMethods(i).forEach(x -> System.out.println("Method: " + x));
        System.out.println();
		
        System.out.println("s information...");
        System.out.println(oi.getObjectClassName(s));
        System.out.println(oi.getObjectSuperclassName(s));	
        oi.getObjectFields(s).forEach(x -> System.out.println("Field: " + x));
        oi.getObjectConstructors(s).forEach(x -> System.out.println("Constructor: " + x));
        oi.getObjectMethods(s).forEach(x -> System.out.println("Method: " + x));
        System.out.println();	
    }
}
class ObjectInformation {
    public String getObjectClassName(Object o) { 		
        return o.getClass().getSimpleName();
    }
    public String getObjectSuperclassName(Object o) { 		
        return o.getClass().getGenericSuperclass().getTypeName();
    }
    public ArrayList<String> getObjectFields(Object o) { 
        Field fArray[] = o.getClass().getDeclaredFields();
        ArrayList<String> sArray = new ArrayList<>();
        for(Field f : fArray) { sArray.add(f.getName()); }
        return sArray;
    }
    public ArrayList<String> getObjectConstructors(Object o) { 
        Constructor cArray[] = o.getClass().getDeclaredConstructors();
        ArrayList<String> sArray = new ArrayList<>();
        for(Constructor c : cArray) { sArray.add(c.toString()); }
        return sArray;
    }
    public ArrayList<String> getObjectMethods(Object o) { 
        Method mArray[] = o.getClass().getDeclaredMethods();
        ArrayList<String> sArray = new ArrayList<>();
        for(Method m: mArray) { sArray.add(m.getName()); }
        return sArray;
    }
}
