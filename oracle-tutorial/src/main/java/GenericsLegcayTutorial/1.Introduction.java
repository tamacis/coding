import java.util.List;
import java.util.LinkedList;

/*
Notice the type declaration for the variable myIntList. 
It specifies that this is not just an arbitrary List, but a List of Integer,
written List<Integer>. We say that List is a generic interface that takes a 
type parameter--in this case, Integer. 
We also specify a type parameter when creating the list object.
*/

class Introduction {
    public static void main(String[] args) {
        List<Integer> myIntList = new LinkedList<Integer>(); 
        myIntList.add(new Integer(0)); 
        myIntList.add(1);
        Integer x = myIntList.iterator().next(); 
        System.out.println(x);
    }
}