
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* Interoperating with Legacy Code */

 /*
Using Legacy Code in Generic Code
 */
class ExampleWidgets {

    interface Part {
    }

    static class Inventory {

        /**
         * Adds a new Assembly to the inventory database. The assembly is given
         * the name name, and consists of a set parts specified by parts. All
         * elements of the collection parts must support the Part interface.
         *
         */
        public static void addAssembly(String name, Collection parts) {

        }

        public static Assembly getAssembly(String name) {
            return new Assembly() {
                @Override
                public Collection getParts() {
                    return null;
                }
            };
        }
    }

    interface Assembly {
        // Returns a collection of Parts

        Collection getParts();
    }

    static class Blade implements Part {

    }

    static class Guillotine implements Part {
    }

    public static void main(String[] args) {
        Collection<Part> c = new ArrayList<>();
        c.add(new Guillotine());
        c.add(new Blade());
        Inventory.addAssembly("thingee", c);
        Collection<Part> k = Inventory.getAssembly("thingee").getParts();
    }

    /*
    When we call addAssembly, it expects the second parameter to be of type Collection. 
    The actual argument is of type Collection<Part>. This works, but why? After all, 
    most collections don't contain Part objects, and so in general, the compiler has
    no way of knowing what kind of collection the type Collection refers to.

    In proper generic code, Collection would always be accompanied by a type parameter. 
    When a generic type like Collection is used without a type parameter, it's called a raw type.

    Most people's first instinct is that Collection really means Collection<Object>. 
    However, as we saw earlier, it isn't safe to pass a Collection<Part> in a place 
    where a Collection<Object> is required. It's more accurate to say that the type 
    Collection denotes a collection of some unknown type, just like Collection<?>.
     */
}

/* Erasure and Translation */
class Erasure {

    public String loophole(Integer x) {
        List<String> ys = new LinkedList<>();
        List xs = ys;
        xs.add(x); // Compile-time unchecked warning
        return ys.iterator().next();
    }

    /*
        Here, we've aliased a list of strings and a plain old list. 
        We insert an Integer into the list, and attempt to extract a String. 
      This is clearly wrong. If we ignore the warning and try to execute this code,
      it will fail exactly at the point where we try to use the wrong type. 
    At run time, this code behaves like: */
    public String loopholeErased(Integer x) {
        List ys = new LinkedList();
        List xs = ys;
        xs.add(x);
        return (String) ys.iterator().next(); // run time error
    }
    /* 
    When we extract an element from the list, and attempt to treat it as a string by casting
    it to String, we will get a ClassCastException. 
    The exact same thing happens with the generic version of loophole().
     */
}

/* Using Generic Code in Legacy Code */

/* Now let's consider the inverse case. Imagine that Example.com chose to convert 
their API to use generics, but that some of their clients haven't yet. 
So now the code looks like: */

class GenericExample {
    public interface Part {

    }

    static class Inventory {

        /**
         * Adds a new Assembly to the inventory database. The assembly is given
         * the name name, and consists of a set parts specified by parts. All
         * elements of the collection parts must support the Part interface.
         *
         */
        public static void addAssembly(String name, Collection<Part> parts) {
        }

        public static Assembly getAssembly(String name) {
            return new Assembly() {
                @Override
                public Collection getParts() {
                    return null;
                }
            };
        }
    }

    public interface Assembly {
        // Returns a collection of Parts

        Collection<Part> getParts();
    }

    static class Blade implements Part {

    }

    static class Guillotine implements Part {
    }

    /*
    The client code was written before generics were introduced, but it uses the 
    package collection library, both of which are using generic types. 
    All the uses of generic type declarations in the client code are raw types.

    Line 1 generates an unchecked warning, because a raw Collection is being 
    passed in where a Collection of Parts is expected, and the compiler cannot 
    ensure that the raw Collection really is a Collection of Parts.
    */
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Guillotine());
        c.add(new Blade());

        // 1: unchecked warning
        Inventory.addAssembly("thingee", c);

        Collection k = Inventory.getAssembly("thingee").getParts();
    }

}
