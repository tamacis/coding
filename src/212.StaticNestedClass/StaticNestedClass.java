/*
    A static nested class can access all static members of the outer class (even private).
    A static nested class can have all levels of access applied (public, default protected) except for private.
    A static nested class can be final or abstract, I don't know why you want to, but you can.
    A static nested class can extend other classes and implement interfaces.
*/

class Tester {
    public static void main(String args[]) {
        Outer.StaticNested.displayS();

        //Outer.StaticNested os = new Outer.StaticNested();
        //os.displayS();
    }
}

class Outer {
    String s = "outer s";
    private static String t = "outer t";
    static class StaticNested {
        static String s = "nested s";
        static void displayS(){
            System.out.println(s);
            System.out.println(t);
            System.out.println(new Outer().s);
        }
    }    
}
