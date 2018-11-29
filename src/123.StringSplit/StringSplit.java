
class StringSplit {
    public static void main(String args[]) {
        String s = "Apple-Banana-Orange-Pear-Watermelon";
        String fruits[] = s.split("-"); // parse strings in between the dash character
        for(String temp : fruits ) {
            System.out.println(temp); // display array elements to the console
        }

        System.out.println("\n----Max 3----");
        fruits = s.split("-", 3); // parse up to 3 strings in between the dash character
        for(String temp : fruits ) {
            System.out.println(temp); // display array elements to the console
        }

    }	
}
