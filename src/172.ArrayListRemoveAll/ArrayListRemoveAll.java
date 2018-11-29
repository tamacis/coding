import java.util.*;
class ArrayListRemoveAll {
    public static void main(String args[]) {
        ArrayList<String> states = new ArrayList<String>();
        Collections.addAll(states, "Alaska", "Alabama", "Alabama", "California", "Colorado", "Hawaii", "New York");
        System.out.println("states = " + states);
    
        Collection<String> removeThese = Arrays.asList("Alaska", "Alabama");
        //List<String> removeThese = Arrays.asList("Alaska", "Alabama");
        //ArrayList<String> removeThese = new ArrayList<>();
        //removeThese.add("Alaska");
        //removeThese.add("Alabama");
        System.out.println("removeThese = " + removeThese);
        states.removeAll(removeThese);
        System.out.println("states.removeAll(removeThese), states = " + states);
        System.out.println("\n-------\n");

        states.clear();
        Collections.addAll(states, "Alaska", "Alabama", "Alabama", "California", "Colorado", "Hawaii", "New York");
        System.out.println("states = " + states);
        states.removeAll(Arrays.asList("Alabama")); // better than remove() if you need to ensure all matching elements are removed
        System.out.println("After removeAll, states = " + states);
    }
}