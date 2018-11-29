class CharAlphabet {
    public static void main(String args[]) {
        char varA = 'A';
        char backSpace = 8; 

        for (int i = 1; i <= 26; i++) {
            System.out.print(varA);
            System.out.print(",");
            varA++;
        }
        System.out.print(backSpace);
        System.out.println(" ");
    }
}