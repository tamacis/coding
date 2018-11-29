class StringLength {
    public static void main(String args[]) {
        String apples = "Apples";
        System.out.println(apples + " length: " + apples.length());

        String oranges = new String("Oranges");
        System.out.println(oranges + " length: " + oranges.length());
       
        char oranges2[] = { 'O', 'r', 'a', 'n', 'g', 'e', 's' };
        System.out.println("Oranges2 length: " + oranges2.length); // notice the variable versus the method.
    }
}
