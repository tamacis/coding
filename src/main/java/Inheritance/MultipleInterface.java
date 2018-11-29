package Inheritance; 

interface A {
    void sum();
}

interface B {
    // Different methods signatures ambugity
    int sum();
}

/*
public class MultipleInterface implements A, B {

    // Which one to overide??
    @Override
    public void sum() {
    }

    @Override
    public int sum() {
        return 0;
    }

}
*/