import java.util.*;
class ArrayListIntro {
    public static void main(String args[]) {
        ArrayList ref = new ArrayList();
        ref.add("Hello");
        ref.add("World");
        ref.add(155);
        ref.add(41);
        ref.add(new StringBuilder("dan"));
        System.out.println("ref = " + ref); 
        System.out.println();

        ArrayList<StringBuilder> gen = new ArrayList<StringBuilder>();
        gen.add(new StringBuilder("Alaska"));
        gen.add(new StringBuilder("Colorado"));
        gen.add(new StringBuilder("Florida"));
        gen.add(new StringBuilder("Hawaii"));
        gen.add(new StringBuilder("New York"));
        //gen.add("Utah");
        System.out.println("gen = "+ gen);
        System.out.println();

        ArrayList<Integer> infer = new ArrayList<>();
        infer.add(new Integer(41));
        infer.add(new Integer(82));
        infer.add(54); //autoboxing
        infer.add(1890);
        infer.add(0x42);
        //infer.add("100");
        System.out.println("infer = "+ infer);
    }
}
