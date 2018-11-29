import java.util.*;
class ArrayListRemoveRange {
    public static void main(String args[]) {
        ArrayList<String> states = new ArrayList<String>();
        Collections.addAll(states, "Alaska", "Alabama", "Alabama", "California", "Colorado", "Hawaii", "New York");
        System.out.println("states = " + states);
    
        states.removeRange(0, 3); // error
        //System.out.println("states.removeRange(0, 3), states = " + states);
        //states.subList(0, 3).clear();
        //System.out.println("states.subList(0, 3).clear(), states = " + states);	
    }
}
