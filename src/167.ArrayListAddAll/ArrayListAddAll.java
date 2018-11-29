import java.util.*;

class ArrayListAddAll {
    public static void main(String args[]) {
        String sArray[] = { "Alaska", "Colorado", "Kentucky", "Ohio", "Texas", "Vermont" }; // ordinary good old array
        List<String> list = Arrays.asList(sArray);
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Some of my favorite states");
        myList.addAll(list);
        System.out.println(myList); 

        myList.addAll(3, Arrays.asList("Delaware", "Florida", "Hawaii")); 
        System.out.println(myList);
        System.out.println();

        ArrayList<Number> numList = new ArrayList<>();
        numList.add(new Double(6.99));
        numList.addAll(Arrays.asList(7, 10.3, 199, 1400.999, 41, 7.65f)); // autoboxing to primitive wrapper objects
        for(Number n : numList) {
            System.out.println(n + ", class type = " + n.getClass()); // getClass() - inherited from Object
        }
        System.out.println();

        ArrayList<RuntimeException> exList = new ArrayList<>();
        exList.addAll(Arrays.asList(new NullPointerException(), new IndexOutOfBoundsException(), new ClassCastException()));
        System.out.println(exList);
        System.out.println();

        // extra credit
        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList, "Blue", "Green", "Red", "Yellow", "Orange");
        System.out.println(strList);
    }
}