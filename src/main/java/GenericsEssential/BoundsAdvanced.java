package GenericsEssential;

import java.util.Collection;

public class BoundsAdvanced {

    /**
     * Bounds may also be used in more advanced ways.
     * The example below is a simplified version from java.util.Collections and show a recursive bound.
     * The generic parameter T is also used inside the bound Comparable<T> to make sure that
     * the objects contained in the collection are comparable amongst themselves.
     **/
    // The method max takes a parameter which must contain elements of a subclass of Comparable.
    // In addition the Comparable class must be comparable with the declared type
    public static <T extends Comparable<T>> T max(Collection<T> collection) {
        T currentMax = collection.iterator().next();
        for (T element : collection) {
            if (currentMax.compareTo(element) < 0) currentMax = element;
        }
        return currentMax;
  }

    /**
     * By far the most difficult generic declaration comes from java.lang.Enum and
     * looks like this
     * Class Enum<E extends Enum<E>> implements Comparable<E>.
     * Like the above declaration this is a recursive bound but it is even more
     * constrained than the above.
     * The key to understanding this is to know how enums are implemented in Java.
     **/

    // Declaring an enum
    enum TapirEnum {
        MALAYAN, BRAZILIAN, BAIRD, MOUNTAIN
    }

    /**
     * As can be seen in the code above:
     * E extends Enum<E> maps to Tapir extends Enum<Tapir> and Comparable<E> maps to Comparable<Tapir>.
     *
     * This makes sure that enums of one type can only be compared with enums of the same type.
     * The innermost generic parameter makes the subclass’ type available to the superclass
     * allowing it to define methods whose parameters and return values are that of the subclass’.
     */

}

// creates a class similar to this!
final class Tapir extends Enum<Tapir> implements Comparable<Tapir> {
    private Tapir(String name, int ordinal) {
        super(name, ordinal);
    }

    public static final Tapir MALAYAN = new Tapir("MALAYAN", 0);
    public static final Tapir BRAZILIAN = new Tapir("BRAZILIAN", 1);
    public static final Tapir BAIRD = new Tapir("BAIRD", 2);
    public static final Tapir MOUNTAIN = new Tapir("MOUNTAIN", 3);
    private static final Tapir[] VALUES = {MALAYAN, BRAZILIAN, BAIRD, MOUNTAIN};

    public static Tapir[] values() {
        return VALUES.clone()
    }

    public static Tapir valueOf(String name) {
        for (Tapir t : VALUES) if t.getName().equals(name) return t;
        throw new IllegalArumentException();
    }
}
