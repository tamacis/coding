/*
Erasure of Generic Types
 */

// Because the type parameter T is unbounded, the Java compiler replaces it with Object: 
class ErasureGenericUnbounded {

    class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
        // ...
    }
}

//The Java compiler replaces the bounded type parameter T with the first bound class, Comparable: 
class ErasureGenericBounded {

    class Node<T extends Comparable<T>> {

        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
        // ...
    }
}
