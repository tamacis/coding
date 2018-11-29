class ForBreakStatement {    
    public static void main(String args[]) {
            // All three expressions are optional, let's set only the increment expression
            // introducing the Break Java keyword
            int i = 0;
            for( ; ; i++) {
                    System.out.println("i = " + i);
                    if(i>=5) {
                        break; // the Java break keyword will break out of the for loop 
                               // and program execution will continue at the end of the for code block.
                    }
            }
            System.out.println("We broke out of the for loop!");
    }
}