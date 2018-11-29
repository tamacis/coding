
class GenericIntro {
    public static void main(String args[]) {
        BasicGeneric<String> str1 = new BasicGeneric<String>(new String("Hello"));
        str1.displayReference();

        BasicGeneric<String> str2 = new BasicGeneric<String>("World");
        str2.displayReference();

        BasicGeneric<Integer> i1 = new BasicGeneric<Integer>(new Integer(41));
        i1.displayReference();

        BasicGeneric<Integer> i2 = new BasicGeneric<Integer>(1024);
        i2.displayReference();

        BasicGeneric<Boolean> b1 = new BasicGeneric<Boolean>(new Boolean("true"));
        b1.displayReference();

        BasicGeneric<Object> o1 = new BasicGeneric<Object>(new Object());
        o1.displayReference();
    }
}

class BasicGeneric<T> {
    T refVariable;
    BasicGeneric(T param) {
        refVariable = param;
    }
    void displayReference() {
        System.out.println(refVariable);
    }
}  

