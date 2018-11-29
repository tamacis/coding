class StringEquals {
    public static void main(String args[]) {
        String a1 = "Apples";
        String a2 = new String("Apples");
        String a3 = new String("Apples").intern(); // extra credit
        System.out.println("a1.equals(a2): " + a1.equals(a2)); // "Apples" equals "Apples"
        System.out.println("a1 == a2: " + (a1 == a2)); // reference variables point to different object instances
        System.out.println("a3 == a1: " + (a3 == a1)); // reference variables point to same object in the string literal pool.       
    }
}