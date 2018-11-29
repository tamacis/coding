
class OverridingEquals {
    public static void main(String args[]) {
        Intster x = new Intster(41);
        Intster y = new Intster(41);

        System.out.println("x = " + x.getState());
        System.out.println("x hashCode = " + x.hashCode());
        System.out.println("y = " + y.getState());
        System.out.println("y hashCode = " + y.hashCode());
        System.out.println();

        System.out.println("x==y " + (x==y));
        System.out.println("x.equals(y) " + x.equals(y));
        System.out.println();

        //StringBuilder sb = new StringBuilder("ABC");
        //System.out.println("x.equals(sb) " + x.equals(sb));

        //System.out.println("Reflexive = " + x.equals(x)); 
        //System.out.println("Symmetric = " + (x.equals(y) && y.equals(x)));
        //Intster z = new Intster(41);
        //System.out.println("Transitive = " + (x.equals(y) && y.equals(z) && x.equals(z)));
        //for(int i=0; i<5; i++) {
        //	System.out.println("Consistent = " + x.equals(y));
        //}
        //System.out.println("null = " + x.equals(null));
        //System.out.println("hashCode test = " + (x.hashCode() == y.hashCode()));
    }
}

class Intster { 
    private int state;

    Intster(int state) {
        this.state = state;
    }

    int getState() { return state; }
    
    @Override
    public boolean equals(Object obj) {
        //Step 1 - start off by duplicating the equals method from the Object class
        //Step 2 - modify the return statement with the following if statement
        if (this == obj) { // both references refer to the same object! Easy peasy!
            return true;        
        }
        //Step 3 - check to see if we are dealing with an object that is an instance of Intster
        if(obj instanceof Intster) {
                //Step 4 - We are now ready to see if the state of the object parameter matches 
                // the state of current object
            if(this.state == ((Intster)obj).getState()) { // downcast 
                if(this.hashCode() == obj.hashCode()) {
                    return true; // we are done!!!
                }
            }
        }
        return false;
    }
    
    //Step 5 - Do not forget to override the .hashCode() method and ensure hash codes match!!!!
    @Override
    public int hashCode() {
        // I'll keep it simple for the tutorial.
        // If you do not understand what is going on below,
        // you need to watch and understand my .hashCode override tutorial
        return state*1; 
    }
	
}
