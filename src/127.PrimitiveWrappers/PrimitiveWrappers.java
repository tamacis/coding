class PrimitiveWrappers {
    public static void main(String args[]) {
        int i = 41;
        IntWrapper iw = new IntWrapper( i ); // box the primitive int type value into the object
        i = iw.getInt(); // unbox the int value from the wrapper object

        Integer ref = new Integer(i); // box the primitive int type value into the object
        i = ref.intValue(); // unbox the int value from the wrapper object
        System.out.println(i);
        String s = "i value: ".concat(ref.toString()); // unbox the value as a String object from the wrapper object
        System.out.println(s);
    }
}

final class IntWrapper {
    private final int intVal;

    IntWrapper(int intVal) {
        this.intVal = intVal;
    }

    public int getInt() {
        return intVal;
    }
}