class ForStatement {    
    public static void main(String args[]) {
        System.out.println("Let's begin the for loop.");
        for(int i=0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("The first for loop is complete.");
        System.out.println();

        System.out.println("Let's begin the second for loop.");
        for(int i=4; i < 4; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("The second for loop is complete.");
        System.out.println();

        System.out.println("Let's begin the third for loop.");
        for(int i=5; i >=0; i--) {
            System.out.println("i = " + i);
        }
        System.out.println("The Third for loop is complete.");
    }
}