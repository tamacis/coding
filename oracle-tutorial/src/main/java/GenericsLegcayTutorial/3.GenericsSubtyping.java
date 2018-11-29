
import java.util.ArrayList;
import java.util.List;

class GenericsSubtyping {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(); // 1
//        List<Object> lo = ls; // 2 

//        lo.add(new Object()); // 3
        String s = ls.get(0); // 4: Attempts to assign an Object to a String!
    }

    /*
   Line 1 is certainly legal. The trickier part of the question is line 2. 
   This boils down to the question: is a List of String a List of Object. 
   Most people instinctively answer, "Sure!"
     */

    /*
    In general, if Foo is a subtype (subclass or subinterface) of Bar, 
    and G is some generic type declaration, 
    it is not the case that G<Foo> is a subtype of G<Bar>. 
    
    This is probably the hardest thing you need to learn about generics, 
    because it goes against our deeply held intuitions.
    */

    
}
