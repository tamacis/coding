import java.util.*;

class ArrayListCommonMethods {
    public static void main(String args[]) {
        ArrayList<Number> judgesScores = new ArrayList<>();
        System.out.println("judgesScores.isEmpty() = " + judgesScores.isEmpty());
        judgesScores.addAll(Arrays.asList(9.1, 8.9, 10, 9.3, 9.1, 9.4)); // autoboxing to wrapper objects
        System.out.println("judgesScores = " + judgesScores);
        System.out.println("judgesScores.isEmpty() = " + judgesScores.isEmpty());
        System.out.println("judgesScores.size() = " + judgesScores.size());
        System.out.println("judgesScores.contains(8.7) = " + judgesScores.contains(8.7));
        System.out.println("judgesScores.contains(9.3) = " + judgesScores.contains(9.3));  
        System.out.println("judgesScores.indexOf(9.1) = " + judgesScores.indexOf(9.1));         
        System.out.println("judgesScores.lastIndexOf(9.1) = " + judgesScores.lastIndexOf(9.1));         
        System.out.println("judgesScores.indexOf(8.1) = " + judgesScores.indexOf(8.1));         
        System.out.println("judgesScores.lastIndexOf(8.1) = " + judgesScores.lastIndexOf(8.1));         
        System.out.println("judgesScores.get(3) = " + judgesScores.get(3));
        System.out.println("judgesScores.set(3, 9.99) = " + judgesScores.set(3, 9.99));      
        System.out.println("judgesScores = " + judgesScores);
    }