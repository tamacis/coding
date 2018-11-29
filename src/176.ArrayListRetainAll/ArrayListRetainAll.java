
import java.util.*;
class ArrayListRetainAll {
    public static void main(String args[]) {
        ArrayList<String> states = new ArrayList<String>();
        Collections.addAll(states, "Alaska", "Alabama", "California", "Colorado", "Hawaii", "New York");
        System.out.println("states = " + states);
    
        Collection<String> retainThese = Arrays.asList("Colorado", "New York");
        //List<String> retainThese = Arrays.asList("Colorado", "New York");
        //ArrayList<String> retainThese = new ArrayList<>();
        //retainThese.add("Colorado");
        //retainThese.add("New York");
        System.out.println("retainThese = " + retainThese);
        states.retainAll(retainThese);
        System.out.println("states.retainAll(retainThese), states = " + states);
    }
}
