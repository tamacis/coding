import java.util.*;
class ArrayListConstructors {
    public static void main(String args[]) {
        ArrayList<String> a = new ArrayList<String>();
        int counter = 0;
        for(String s : a ) {
            counter++;
        }
        System.out.println("No constructor arguments capacity: (can't obtain) " + counter);

        ArrayList<String> b = new ArrayList<String>(41);
        counter = 0;
        for(String s : b ) {
            counter++;
        }
        System.out.println("Constructor argument 41 capacity: (can't obtain) " + counter);
        System.out.println();

        String sArray[] = { "Alaska", "Colorado", "Kentucky", "Ohio", "Texas", "Vermont" };
        List<String> list = Arrays.asList(sArray);
        ArrayList<String> c = new ArrayList<String>(list);
        c.add("Hawaii");
        for (String s: c) {
            System.out.println("ArrayList c element: " + s);
        }
        System.out.println(c);
    }
}