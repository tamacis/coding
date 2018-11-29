import java.util.*;
import java.util.function.*;

class ArrayListForEach {
    public static void main(String args[]) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Alabama");
        strList.add("Alaska");
        strList.addAll(Arrays.asList("California", "Colorado"));
        Collections.addAll(strList, "Hawaii","New York");
        System.out.println(strList);
        System.out.println();

        for(int i=0; i < strList.size(); i++) {
            System.out.println("Regular for statement: "+ strList.get(i));
        }
        System.out.println();

        for(String s : strList) {
            System.out.println("Enhanced for statement: " + s);
        }
        System.out.println();

        Consumer<String> cLambda = x -> System.out.println("forEach() method: " + x);
        strList.forEach(cLambda);
        System.out.println();

        strList.forEach(x -> System.out.println("forEach() without a Consumer variable: " + x));
        System.out.println("\n----------\n");
        
        ArrayList<Number> numList = new ArrayList<Number>();
        Collections.addAll(numList, 41, 7.99, 108, 8.34f);
        numList.forEach(x -> System.out.println(x + "   " + x.getClass()));
        System.out.println();

        Consumer<Number> cNum = x -> System.out.println(x + "   " + x.getClass());
        numList.forEach(cNum);
        System.out.println();
        
    }
}