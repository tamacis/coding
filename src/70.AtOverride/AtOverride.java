
class AtOverride {
    public static void main(String args[]) {
        new Child().displayMessage();
        new Parent().displayMessage();
        new GrandParent().displayMessage();
    }
}
class GrandParent {
    void displayMessage() {
        System.out.println("Invoking the method from the GRANDPARENT class.");
    }
}
class Parent extends GrandParent {
    @Override
    void displayMessage() {
        System.out.println("Invoking the method from the PARENT class.");
    }
}
class Child extends Parent {
    // We typoed an s in our overridden method
    @Override
    void displayMesage() {
        System.out.println("Invoking the method from the CHILD class.");
    }
}
