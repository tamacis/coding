class ForIncrementOnly {    
    public static void main(String args[]) {
            // All three expressions are optional, let's set only the increment expression
            
            int i = 0;
            for( ; ; i++) {
                    System.out.println("CTRL-C to escape, i = " + i);
            }
    }
}