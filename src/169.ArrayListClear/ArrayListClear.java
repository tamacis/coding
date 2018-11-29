import java.util.*;

class ArrayListClearClone {
    public static void main(String args[]) {        
        ArrayList<String> strList = new ArrayList<String>();
        Collections.addAll(strList, "Alaska", "Alabama", "California" );
        strList.add("Colorado");
        strList.addAll(Arrays.asList("Hawaii", "New York"));
        System.out.println("strList = "  + strList);

        Object cloneList = strList.clone();
        System.out.println("cloneList = " + cloneList);
        System.out.println("cloneList instance class = " + cloneList.getClass());
        System.out.println();
    
        strList.clear();
        System.out.println("after strList.clear() strList = " + strList);
        System.out.println("cloneList is unaffected: " + cloneList);
        System.out.println();
        // cloneList reference variable is of type Object, not ArrayList. 
        // We cannot call ArrayList methods that are not inherited from Object!
        // cloneList.clear(); // error - clear() method does not exist in Object!
           
        //ArrayList<String> newList = cloneList; // error
        //ArrayList<String> newList = (ArrayList<String>)cloneList;
        //System.out.println("newList = " + newList); 
        //newList.clear();
        //System.out.println("after newList.clear() newList = " + newList);
        //System.out.println("cloneList = " + cloneList);
    }
}