import java.util.ArrayList;

class ArrayListAdd {
    public static void main(String args[]) {
        ArrayList<StringBuilder> aList = new ArrayList<>();
        aList.add(new StringBuilder("Alaska"));
        aList.add(new StringBuilder("New York"));
        aList.add(new StringBuilder("Vermont"));
        System.out.println(aList); 
        System.out.println();

        aList.add(1, new StringBuilder("Hawaii")); // insert between Alaska and New York
        aList.add(3, new StringBuilder("Ohio")); // insert between New York and Vermont
        System.out.println(aList); 
        System.out.println();

        ArrayList<RuntimeException> reList = new ArrayList<>();
        reList.add(new NullPointerException());
        reList.add(new StringIndexOutOfBoundsException());
        reList.add(new ClassCastException());
        reList.add(2, new IllegalArgumentException());
        System.out.println(reList);
        System.out.println();

        ArrayList<Number> nList = new ArrayList<Number>();
        nList.add(new Byte((byte)41));
        nList.add(new Integer(1024));
        nList.add(1, new Double(4.75));
        System.out.println(nList);
    }
}