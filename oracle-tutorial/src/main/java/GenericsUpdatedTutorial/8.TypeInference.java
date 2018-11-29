package GenericsUpdatedTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Type Inference and Generic Methods

Generic Methods introduced you to type inference, which enables you to invoke a 
generic method as you would an ordinary method, without specifying a type between
angle brackets. 
Consider the following example, BoxDemo, which requires the Box class:
 */
class BoxDemo {

    public static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box : boxes) {
            U boxContents = box.get();
            System.out.println("Box #" + counter + " contains ["
                    + boxContents.toString() + "]");
            counter++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Box<Integer>> listOfIntegerBoxes
                = new ArrayList<>();
        BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);
    }
}

/*
Type Inference and Generic Constructors of Generic and Non-Generic Classes

 */
class MyClass<X> {

    <T> MyClass(T t) {
        // This statement creates an instance of the parameterized type MyClass<Integer>;
        // The compiler infers the type String for the formal type parameter, T,
        new MyClass<Integer>("");

    }

}

/*Target Types
    
 */
// Consider the method Collections.emptyList, which is declared as follows:
// <T> List<T> emptyList();
//Consider the following assignment statement:
class TargetTypes {

    public static void main(String[] args) {

        List<String> listOne = Collections.emptyList();

        processStringList(Collections.<String>emptyList());

        //This is no longer necessary in Java SE 8. 
        //The notion of what is a target type has been expanded to include method arguments, 
        // such as the argument to the method processStringList. 
        //In this case, processStringList requires an argument of type List<String>
        // In Java 8, the following statement compiles:
        processStringList(Collections.emptyList());
    }

    //Consider the following method:
    static void processStringList(List<String> stringList) {
        // process stringList
    }

}
