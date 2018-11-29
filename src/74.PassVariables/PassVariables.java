class PassVariables {
    public static void main(String args[]) {
        int argInt = 99;
        Box argBox = new Box();
        argBox.length = 5;
        argBox.height = 5;
        argBox.width = 5;

        System.out.println("\nOriginal values from main method...");
        System.out.println("argInt = " + argInt);        
        System.out.println("argBox dimensions: " + argBox.length + ", " + argBox.height + ", " + argBox.width);   
        System.out.println("argBox = " + argBox);

        Acme proof = new Acme();
        proof.passByValue(41, argInt, argBox);

        System.out.println("\n-----------\nValues back in main method....");
        System.out.println("argInt = " + argInt);
        System.out.println("argBox dimensions: " + argBox.length + ", " + argBox.height + ", " + argBox.width);
        System.out.println("argBox = " + argBox);   
    }
}

class Acme {

    void passByValue(int paramLiteral, int paramInt, Box paramBox) {
        System.out.println("\n-----------\nInvoking passByValue....");  
      
        paramLiteral++; // it was a literal as an argument - nothing to prove!
        System.out.println("Nothig to prove, paramLiteral = " + paramLiteral);

        paramInt++;
        System.out.println("paramInt = " + paramInt);

        // Box anotherBox = new Box(); // ???
        // paramBox = anotherBox; // ???

        paramBox.length = 14;
        paramBox.height = 14;
        paramBox.width = 14;
        System.out.println("paramBox dimensions: " + paramBox.length + ", " + paramBox.height + ", " + paramBox.width); 
        System.out.println("paramBox = " + paramBox);  
    }
    
}

class Box {
    int length = 0;
    int height = 0;
    int width = 0;
} 
