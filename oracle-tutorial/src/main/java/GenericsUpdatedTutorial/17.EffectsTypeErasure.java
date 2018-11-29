
class Node<T> {

    public T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class MyNode extends Node<Integer> {

    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}

/*
Bridge Methods 

When compiling a class or interface that extends a parameterized class or implements 
a parameterized interface, the compiler may need to create a synthetic method, 
called a bridge method, as part of the type erasure process.

 */

// After type erasure, the Node and MyNode classes become

class BridgeMethods {

    class Node {

        public Object data;

        public Node(Object data) {
            this.data = data;
        }

        public void setData(Object data) {
            System.out.println("Node.setData");
            this.data = data;
        }
    }

    /*
    The Node method becomes setData(Object) and the MyNode method becomes setData(Integer).
Therefore, the MyNode setData method does not override the Node setData method.
To solve this problem and preserve the polymorphism of generic types after type erasure,
a Java compiler generates a bridge method to ensure that subtyping works as expected. 
     */
    class MyNode extends Node {

        public MyNode(Integer data) {
            super(data);
        }

        @Override
        public void setData(Object data) {
            setData((Integer) data);
        }

        public void setData(Integer data) {
            System.out.println("MyNode.setData");
            super.setData(data);
        }

    }
}
