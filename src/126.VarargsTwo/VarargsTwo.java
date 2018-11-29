class VarargsTwo {
    public static void main(String ... args) { // varargs in main method declaration
        System.out.print("Command-line arguments: ");
        for (String temp : args) {
            System.out.print(temp + " ");
        }
        System.out.println();

        new VarargsConstructor(12, 5, 5876, 1024); // sequence of int arguments
        new VarargsConstructor("Tom", "Jane", "Bill", "Mary", "Johnny"); // sequence of String arguments
        int iArray[] = { 123, 7, -1034, -1200 } ;
        new VarargsConstructor(iArray); // pass an array 
        //new VarargsConstructor(); // no arguments = empty varargs array. Which constructor to use??? Ambiguity!
        VarargsConstructor vc = new VarargsConstructor();  // What is this really doing???
        System.out.println();
	
        VarargsMethod vm = new VarargsMethod();
        vm.displayArray(-903, 1, 8276, 41, 7778, 0); // sequence of int arguments
        vm.displayArray("Apple", "Orange", "Pear"); // sequence of String arguments
        String sArray[] = { "A", "B", "C" };	
        vm.displayArray(sArray); // pass an array 
        vm.displayArray("Lotto numbers: ", 7, 12, 14, 23, 26, 31 );
        //vm.displayArray(); // no arguments = empty varargs array. Which method to use??? Ambiguity!
        //String ... tArrary = { "A", "B", "C" }; //No - only valid syntax inside of a parameter list.
    }
}

class VarargsConstructor {

    // VarargsConstructor() {
    //     super();
    //     System.out.print("\n Non ambiguous ");
    // }

    VarargsConstructor(int ... items) {
        System.out.print("\nConstructor int data type varargs array: ");
        for(int i : items) {        
            System.out.print(i + " ");
        }
    }

    VarargsConstructor(String ... items) {
        System.out.print("\nConstructor String data type varargs array: ");
        for(String s : items) {
            System.out.print(s + " ");
        }
    }
}

class VarargsMethod {
    void displayArray(int ... items) {
        System.out.print("\nMethod int data type varargs array: ");
        for(int i : items) {        
            System.out.print(i + " ");
        }
    }

    void displayArray(String ... items) {
        System.out.print("\nMethod String data type varargs array: ");
        for(String s : items) {        
            System.out.print(s + " ");
        }
    }

    void displayArray(String name, int ... numbers) {
        System.out.println();
        System.out.print(name);
        for(int i : numbers) {        
            System.out.print(i + " ");
        }
    }

    //void displayArray(String ... names, int ... numbers) { } // No - only one varargs per parameter list
    //void displayArray(int ... numbers, String name) { } // No - varargs must be last parameter

}
