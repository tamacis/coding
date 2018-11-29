class Increment {
    public static void main(String args[]) {
        int a = 1;
        int b = 10;

        a = a + 1; // a equals 2 now
        b = b - 1; // b equals 9 now
        System.out.println("a = " + a + ", b = "+ b);

        a++; // a equals 3 now
        b--; // b equals 8 now
        System.out.println("a = " + a + ", b = "+ b);

        ++a; // a equals 4 now
        --b; // b equals 7 now
        System.out.println("a = " + a + ", b = "+ b);

    }
}
