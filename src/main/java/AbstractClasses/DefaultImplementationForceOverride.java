package AbstractClasses;

interface ContentHolder {
    default void showContents() {
        System.out.println("I am holding misc contents");
    }
}

// You can turn the class to abstract and override the method but then you 
// cannot have new Box() anymore, making the default implementation useless..
class Box implements ContentHolder {

}

// So instead we create an abstract BoxBridge class that overrides the method
// and delegates to abstract method which all subclasses are forced to override
abstract class BoxBridge extends Box {
    @Override
    public void showContents() {
        showContentsAbstract();
    }
        
    public abstract void showContentsAbstract();
}

// GiftBox now is forced to Override the showContentsAbstract method from the
// abstract BoxBridge class
class GiftBox extends BoxBridge {
    @Override
    public void showContentsAbstract() {
        System.out.println("I am holding an vase");
    }
}

public class DefaultImplementationForceOverride {
    public static void main(String[] args) {
        // Now you can have Box with default implementation
        Box b = new Box();
        b.showContents();
        // And GiftBox which is forced to override the showContents();
        Box g = new GiftBox();
        g.showContents();
    }
}