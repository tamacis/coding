
class OverridingMethods {
    public static void main(String args[]) {
        Child c = new Child();
        c.displayMessage();

        Parent p = new Parent();
        p.displayMessage();

        GrandParent g = new GrandParent();
        g.displayMessage();
    }
}

class GrandParent {
    void displayMessage() {
        System.out.println("Invoking the method from the GRANDPARENT class.");
    }
}

class Parent extends GrandParent {
    void displayMessage() {
        System.out.println("Invoking the method from the PARENT class.");
    }
}

class Child extends Parent {
    void displayMessage() {
        System.out.println("Invoking the method from the CHILD class.");
    }
}

