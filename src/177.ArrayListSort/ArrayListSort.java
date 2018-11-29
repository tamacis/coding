// int Comparator( (x, y => x.compareTo(y)))
// Return -1 if lesser than
// Return 0 if equal
// Return 1 if greater

import java.util.*;
class ArrayListSort {
    public static void main(String args[]) {
        ArrayList<String> strArray = new ArrayList<>();        
        Collections.addAll(strArray, "Yellow", "Blue", "Green", "Orange", "Violet", "Red", "Pink");
        System.out.println(strArray);
        Collections.sort(strArray);
        System.out.println(strArray);
        System.out.println("\n---------\n");
        Collections.sort(strArray, Collections.reverseOrder());
        System.out.println(strArray); 
        Collections.sort(strArray);
        System.out.println(strArray);           
        strArray.sort(Collections.reverseOrder());
        System.out.println(strArray);

        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.addAll(Arrays.asList(17, 3, 7, 0, 1024, 518));
        System.out.println(intArray);
        Collections.sort(intArray);
        System.out.println(intArray);
        System.out.println("\n---------\n");

        String blue = "Blue";
        String yellow = "Yellow";
        String green = "Green";
        
        
        System.out.println("green.compareTo(yellow) = " + green.compareTo(yellow));
        System.out.println("green.compareTo(green) = " + green.compareTo(green));
        System.out.println("green.compareTo(blue) = " + green.compareTo(blue));

        FunctionalInterface<String> fi;
        fi = (x,y) -> x.compareTo(y);
        System.out.println("fi.compare(green, yellow) = " + fi.compare(green, yellow));
        System.out.println("fi.compare(green, green) = " + fi.compare(green, green));
        System.out.println("fi.compare(green, blue) = " + fi.compare(green, blue));
        System.out.println("\n---------\n");

        Comparator<String> c;
        c = (x,y) -> x.compareTo(y);
        System.out.println("c.compare(green, yellow) = " + c.compare(green, yellow));
        System.out.println("c.compare(green, green)  = " + c.compare(green, green));
        System.out.println("c.compare(green, blue) = " + c.compare(green, blue));
        System.out.println("\n---------\n");
     
        strArray.sort(c);
        System.out.println(strArray); 
        c = (x,y) -> -x.compareTo(y);  
        strArray.sort(c);
        System.out.println(strArray);         
    }
}

interface FunctionalInterface<T>{
    int compare(T firstArg, T secondArg);    
}
