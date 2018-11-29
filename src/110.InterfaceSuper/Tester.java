class Tester implements InterfaceOne {
    public static void main(String args[]) {
        System.out.println(inOne);
        System.out.println(inTwo);
        System.out.println(inThree);

        new Tester().youWillInheritMeAndYouBetterEnjoyIt();
    }

    @Override
    public void youWillInheritMeAndYouBetterEnjoyIt() {
        System.out.println("Look at all this beautiful inheritance ... sniff, sniff.");
    }
}

interface InterfaceOne extends InterfaceTwo, InterfaceThree, GoodOldGrandpa {
    // remember all interface variables are public static final implicitly   
    public static final String inOne = "Hello from interface ONE!";  
}

interface InterfaceTwo {
    String inTwo = "Hello from interface TWO!";    
}

interface InterfaceThree {
    String inThree = "Hello from interface THREE!";  
}

interface GoodOldGrandpa {
    void youWillInheritMeAndYouBetterEnjoyIt();
}