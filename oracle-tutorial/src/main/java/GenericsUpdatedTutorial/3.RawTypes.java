/* Raw Types

A raw type is the name of a generic class or interface without any type arguments. 
For example, given the generic Box class:

 */

class RawTypesDemo {

    static class Box<T> {

        public void set(T t) {

        }
    }

    public static void main(String[] args) {

        /*
To create a parameterized type of Box<T>, you supply an actual type argument 
for the formal type parameter T: */
        Box<Integer> intBox = new Box<>();

//If the actual type argument is omitted, you create a raw type of Box<T>:
// When using raw types, you essentially get pre-generics behavior — a Box gives you Objects
        Box rawBox = new Box();

        // For backward compatibility, assigning a parameterized type to its raw type is allowed:
        Box<String> stringBox = new Box<>();
        rawBox = stringBox;               // OK

//         But if you assign a raw type to a parameterized type, you get a warning:
        rawBox = new Box();           // rawBox is a raw type of Box<T>
        Box<Integer> intBoxy = rawBox;     // warning: unchecked conversion

    }
}
