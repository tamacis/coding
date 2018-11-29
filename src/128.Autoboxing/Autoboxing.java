
class Autoboxing {
    public static void main(String args[]) {
        Integer jenny = new Integer("8675309"); // just boxing a String object to an Integer object
        jenny++; // auto-unbox jenny to int type, perform ++, autobox result back into jenny object
        int j = jenny; // auto-unbox jenny to int type, then assign to int j
        j *= 2;
        jenny *= 2; // auto-unbox jenny to int type, evaluate result *= 2, autobox result back into jenny object
        System.out.println(j + " - " + jenny ); 

        Integer int1 = 12;
        int1 = tripleIt(int1);
        System.out.println("int1 = " + int1);

        int int2 = 12;
        int2 = tripleIt(int2);
        System.out.println("int2 = " + int2);
    }

    static int tripleIt(Integer x) {
        return x * 3;
    }
}

