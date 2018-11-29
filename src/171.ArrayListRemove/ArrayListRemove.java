import java.util.*;
class ArrayListRemove {
    public static void main(String args[]) {
        Object returnVal;
        ArrayList<String> states = new ArrayList<String>();
        Collections.addAll(states, "Alaska", "Alabama", "California", "Colorado", "Hawaii", "New York");
        System.out.println("states = " + states);
    
        returnVal = states.remove(3);
        System.out.println("states.remove(3), states = " + states);
        System.out.println("returnVal = " + returnVal);

        returnVal = states.remove("California");
        System.out.println("states.remove(\"California\"), states = " + states);
        System.out.println("returnVal = " + returnVal);
        System.out.println("\n----------\n");

        ArrayList<Integer> integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1001, 1002, new Integer(1003), new Integer(1004), 1005, 1006, 1007);
        System.out.println("integers = " + integers);
    
        returnVal = integers.remove(3); // what happens here ???
        System.out.println("integers.remove(3), integers = " + integers);
        System.out.println("returnVal = " + returnVal);

        //returnVal = integers.remove(1005); // what happens here ???
        //returnVal = integers.remove((Integer) 1005); // what happens here ???
        //System.out.println("integers.remove((Integer) 1005), integers = " + integers);
        //System.out.println("returnVal = " + returnVal);
    }
}
