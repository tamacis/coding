package Generics;

interface Sumable<A extends Number, B extends Number> {

    double sum(A a, B b);
}

class Numerics<A extends Number, B extends Number> implements Sumable<A, B> {

    @Override
    public double sum(A a, B b) {
        return a.doubleValue() + b.doubleValue();
    }
}

public class GenericsInterface {

    public static void main(String[] args) {
        Numerics<Integer, Integer> n1 = new Numerics<>();
        System.out.println(n1.sum(1, 2));
        Numerics<Integer, Double> n2 = new Numerics<>();
        System.out.println(n2.sum(2, 3.0));
        Numerics<Integer, Float> n3 = new Numerics<>();
        System.out.println(n3.sum(2, 3.5f));
        Numerics<Byte, Short> n4 = new Numerics<>();
        System.out.println(n4.sum((byte) 1, (short) 2));
    }
}
