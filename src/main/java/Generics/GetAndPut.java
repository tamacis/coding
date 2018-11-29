
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* 
Get And Put Principle
It states,
   1. use an extends wildcard when you only get values out of a structure
   2. use a super wildcard when you only put values into a structure
   3. and don’t use a wildcard when you both get and put.

 */

 /* 
1. For Extends Wildcard(get values i.e Producer extends)
 */
class Extends {

// a method, that takes a collection of numbers, converts each to a double, and sums them up
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums) {
            s += num.doubleValue();
        }
        return s;
    }

//Let's call the method :
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        assert sum(ints) == 6.0;
        List<Double> doubles = Arrays.asList(2.78, 3.14);
        assert sum(doubles) == 5.92;
        List<Number> nums = Arrays.<Number>asList(1, 2, 2.78, 3.14);
        assert sum(nums) == 8.92;

//  Since, sum() method uses extends, all of the following calls are legal. 
//  The first two calls would not be legal if extends was not used.
//  EXCEPTION : 
        List<Integer> intls = new ArrayList<Integer>();
        intls.add(1);
        intls.add(2);
        List<? extends Number> numls = ints;
//        numls.add(null);  // ok
//        assert nums.toString().equals("[1, 2, null]");
    }
}

/*
2. For Super Wildcard(put values i.e Consumer super)
 */
class Super {

    /*
    Here is a method, that takes a collection of numbers and an int n, 
    and puts the first n integers, starting from zero, into the collection:
     */
    public static void addInts(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) {
            ints.add(i);
        }
    }

    public static void main(String[] args) {

    //Let's call the method :
        List<Integer> ints = new ArrayList<Integer>();
        addInts(ints, 5);
        assert ints.toString().equals("[0, 1, 2, 3, 4]");
        List<Number> nums = new ArrayList<Number>();
        addInts(nums, 5);
        nums.add(5.0);
        assert nums.toString().equals("[0, 1, 2, 3, 4, 5.0]");
        List<Object> objs = new ArrayList<Object>();
        addInts(objs, 5);
        objs.add("five");
        assert objs.toString().equals("[0, 1, 2, 3, 4, five]");

//  Since, addInts() method uses super, all of the following calls are legal: 
//  The last two calls would not be legal if super was not used.
//  EXCEPTION : you cannot get anything out from a type declared with a super 
//  wildcard—except for a value of type Object, which is a supertype of every reference type:
        List<Object> objls = Arrays.<Object>asList(1, "two");
        List<? super Integer> intls = objs;
        String str = "";
        for (Object obj : intls) {
            str += obj.toString();
        }
        assert str.equals("1two");

    }
}

/*
3. When both Get and Put, don't Use wildcard

 */
// Whenever you both put values into and get values out of the same structure, 
// you should not use a wildcard.
class NoWildcard {

    public static double sumCount(Collection<Number> nums, int n) {
        Super.addInts(nums, n);
        return Extends.sum(nums);
    }
    public static void main(String[] args) {
        // Let's call the method
        Collection<Number> cn = Arrays.asList(1,3,4.0);
        sumCount(cn, 2);
    }
}
