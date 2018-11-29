
/*
This code should all be familiar, except for the stuff in angle brackets. 
Those are the declarations of the formal type parameters of the interfaces List and Iterator.
 */
class DefinigGenerics {

    private interface List<E> {
        void add(E x);
        Iterator<E> iterator();
    }

    private interface Iterator<E> {
        E next();
        boolean hasNext();
    }
}
