
import java.util.ArrayList;
import java.util.List;

/*
 A list defined by List<? extends ...> can be informally thought of as read-only, 
 but that is not a strict guarantee. 
 Suppose you have the following two classes:
 */
class NaturalNumber {

    private int i;

    public NaturalNumber(int i) {
        this.i = i;
    }
    // ...
}

class EvenNumber extends NaturalNumber {

    public EvenNumber(int i) {
        super(i);
    }
    // ...
}

class GuildelinesWildcards {

    public static void main(String[] args) {
        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;
//        ln.add(new NaturalNumber(35)); // compile-time error
        /* 
    Because List<EvenNumber> is a subtype of List<? extends NaturalNumber>,
    you can assign le to ln. 
    But you cannot use ln to add a natural number to a list of even numbers. 

    The following operations on the list are possible:

    You can add null.
    You can invoke clear.
    You can get the iterator and invoke remove.
    You can capture the wildcard and write elements that you've read from the list.
         */
    }
}
