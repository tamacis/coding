
import java.util.*;
import java.util.function.*;
class ArrayListSpliterator {
    public static void main(String args[]) {
        ArrayList<Integer> intArray = new ArrayList<>();
        for(int i = 0; i <= 50; i++) {
            intArray.add(i * 2); // even numbers 0 to 100
        }
        System.out.println(intArray);

        Spliterator<Integer> mySpliterator = intArray.spliterator();
        System.out.println("mySpliterator.estimateSize() = " + mySpliterator.estimateSize());
        // watch my ArrayList forEach() tutorial for a detailed explanation on how a Consumer functional interface works.
        Consumer<Integer> c = x -> System.out.println("mySpliterator.forEachRemaining = " + x);
        mySpliterator.forEachRemaining(c);
        
    }
}

    