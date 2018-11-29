class TwoArray {
    public static void main(String args[]) {
        int arrayOne[][];
        arrayOne = new int[2][5];

        arrayOne[0][0] = 10;
        arrayOne[0][1] = 20;
        arrayOne[0][2] = 30;
        arrayOne[0][3] = 40;
        arrayOne[0][4] = 50;
        // initialize the second single-dimensional array at index 1
        arrayOne[1][0] = 15;
        arrayOne[1][1] = 25;
        arrayOne[1][2] = 35;
        arrayOne[1][3] = 45;
        arrayOne[1][4] = 55;

        int[][] arrayTwo = { { 10, 20, 30 ,40, 50 }, { 15, 25, 35, 45, 55 } };

        int[] arrayThree[]  = new int[2][5];
        int i = 10;
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 5; y++ ) {
                arrayThree[x][y] = i;
                i += 10;
            }
            i = 15;
        } 

        // Read the arrays now
        System.out.println("Reading arrayOne...");
        for (int x = 0; x < 2; x++) {
            System.out.print("Element " + x + ": ");
            for (int y = 0; y < 5; y++ ) {
                System.out.print(arrayOne[x][y] + " ");
            }
            System.out.println();
        } 

        System.out.println("\nReading arrayTwo...");
        // we don't need to know the array length to read an array using
        for (int[] x : arrayTwo) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        } 

        System.out.println("\nReading arrayThree...");
        for (int[] x : arrayThree) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        } 

    }
}
