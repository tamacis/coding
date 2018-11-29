package GenericsEssential;


import java.util.Collection;

public class MultipleBounds {


    // Actual signature of max from Java Collections
    interface Multiple {
        <T extends Object & Comparable<? super T>> T max(Collection<? extends T> collection);

    }
    /*
    When multiple bounds appear the first bound is used for erasure and the reason for the
    Object in the signature above is that it makes the signature backwards compatible.

    The reason for the super and the extends are the same as above to make the method more generic.
    */
}
