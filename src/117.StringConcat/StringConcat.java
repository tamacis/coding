
class StringConcat {
    public static void main(String args[]) {
        String apples = "Apples ";
        String oranges = new String("& Oranges");
        String NewString = apples.concat(oranges); // Apples & Oranges
        System.out.println(NewString);

        String multiple = "The quick brown fox ".concat("jumps over the ").concat("lazy dog."); 
        System.out.println(multiple);
    
        String enemies = "Cat ";
        enemies.concat("Mouse"); // common error - return value goes nowhere
        System.out.println(enemies);
        enemies = enemies.concat("Mouse"); // remember the return value;
        System.out.println(enemies);
    }
}

