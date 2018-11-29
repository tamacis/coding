
class LocalInnerClass {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.displayST();
    }
}

class Outer {
    String s = "outer s";
    
    void displayST() {
        String t = "method t";  // effectively final - Java 
        // t = "sa";  // ruins effectively final
        System.out.println(s + ", " + t);

        class LocalInner {
            int i = 41;
            
            void displayMessage() {
                i++; 
                System.out.println(s);
                System.out.println(t);
                System.out.println(i);
            }
        }
        LocalInner li = new LocalInner();
        li.displayMessage();
    }    
}