
import java.util.*;
import java.util.function.*;

class ArrayListReplaceAll {
    public static void main(String args[]) {

        FunctionalInterface<Integer> fi;
        fi = (x) -> x + 10 ;        
        Integer i = 31;
        System.out.println(fi.apply(i));

        UnaryOperator<Integer> uo = (x) -> x * x;
        i = 20;
        System.out.println(uo.apply(i));   
    
        UnaryOperator<String> suo = (x) -> x.toUpperCase();
        String s = "Javac Java";
        System.out.println(suo.apply(s));       
    
        ArrayList<String> states = new ArrayList<String>();
        states.addAll(Arrays.asList("Alaska", "Alabama", "California", "Colorado", "Hawaii", "New York"));
        System.out.println("states = " + states);
        UnaryOperator<String> uoRef = (x) -> x.toUpperCase();
        states.replaceAll(uoRef);
        System.out.println("states.ReplaceAll(p) = " + states);
        System.out.println();

        states.replaceAll( (String x) -> x.toLowerCase());
        System.out.println("states.ReplaceAll( (String x) -> x.toLowerCase()) = " + states);

        Collections.replaceAll(states,"california","EarthquakeVille");
        System.out.println("Collections.replaceAll(states,\"california\",\"EarthquakeVille\") = " + states);
        System.out.println();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(5, 62, 107));
        System.out.println("numbers = " + numbers);
        numbers.replaceAll((x) -> x + 10);
        System.out.println("numbers.replaceAll((x) -> x + 10) = " + numbers);
        System.out.println();

    }
}

interface FunctionalInterface<T> {
    T apply(T t) ;
}

