/* Generic Methods

Generic methods are methods that introduce their own type parameters. 
This is similar to declaring a generic type, but the type parameter's 
scope is limited to the method where it is declared. 

Static and non-static generic methods are allowed, as well as generic class constructors.

The syntax for a generic method includes a list of type parameters, inside angle brackets, 
which appears before the method's return type. 

For static generic methods, the type parameter section must appear before the method's return type.

 */

class GenericMethodsDemo {
//The Util class includes a generic method, compare, which compares two Pair objects:

    static class Util {

        public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
            return p1.getKey().equals(p2.getKey())
                    && p1.getValue().equals(p2.getValue());
        }
    }

    static class Pair<K, V> {

        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public static void main(String[] args) {

//The complete syntax for invoking this method would be:
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);

//The type has been explicitly provided, as shown in bold. 
//Generally, this can be left out and the compiler will infer the type that is needed:
        Pair<Integer, String> p3 = new Pair<>(1, "apple");
        Pair<Integer, String> p4 = new Pair<>(2, "pear");
        boolean same2 = Util.compare(p1, p2);
        System.out.println(same);
    }
}
