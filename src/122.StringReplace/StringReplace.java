class StringReplace {
    public static void main(String args[]) {
        String s = "Don't bring these to the airport: pocket knife; liquid bleach; gasoline; guns; etc.";
        String version1 = s.replace(';', ',');
        System.out.println(version1); // version1 = Don't bring the following items to the airport: pocket knife, liquid bleach, gasoline, guns, etc.

        String t = "WYZ WYZ WYZ";
        t.replace('W', 'X'); // common mistake - return value goes nowhere
        System.out.println(t);
        t = t.replace('W', 'X'); // fixed
        System.out.println(t);

        String u = "The quick brown fox jumps over the lazy dog.";
        u.replace("the", "my"); // common mistake - return value goes nowhere
        System.out.println(u);
        u = u.replace("the", "my"); // fixed
        System.out.println(u);
    }	
}

