
import java.util.ArrayList;
import java.util.List;

/*
Lower Bounded Wildcards

 Say you want to write a method that puts Integer objects into a list. 
To maximize flexibility, you would like the method to work on List<Integer>, 
List<Number>, and List<Object> — anything that can hold Integer values.

To write the method that works on lists of Integer and the supertypes of Integer, 
such as Integer, Number, and Object, you would specify List<? super Integer>. 
The term List<Integer> is more restrictive than List<? super Integer> because 
the former matches a list of type Integer only, whereas the latter matches a list
of any type that is a supertype of Integer.

The following code adds the numbers 1 through 10 to the end of a list:

 */
class LowerBounded {

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        // You can call the method with supertypes of Integer
        List<Object> lo = new ArrayList<>();
        List<Number> ln = new ArrayList<>();
        addNumbers(lo);
        addNumbers(ln);
        // Or Integer ofcourse
        List<Integer> li = new ArrayList<>();
        addNumbers(li);
    }
}
