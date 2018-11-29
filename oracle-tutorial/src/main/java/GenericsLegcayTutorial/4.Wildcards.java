
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* Wildcards */
//Consider the problem of writing a routine that prints out all the elements in a collection. 
class Wildcards {

    //And here is a naive attempt at writing it using generics (and the new for loop syntax):
    void printCollectionFail(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

//    The above code only takes Collection<Object>, which, as we've just demonstrated,
//    is not a supertype of all kinds of collections!
//
//    So what is the supertype of all kinds of collections? 
//    It's written Collection<?> (pronounced "collection of unknown"),
//    that is, a collection whose element type matches anything. 
//    It's called a wildcard type for obvious reasons. 
//    
    void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
}


/* Bounded Wildcards */
// Consider a simple drawing application that can draw shapes such as rectangles and circles. 
// To represent these shapes within the program, you could define a class hierarchy such as this:
abstract class Shape {

    public abstract void draw(Canvas c);
}

class Circle extends Shape {

    private int x, y, radius;

    public void draw(Canvas c) {

    }
}

class Rectangle extends Shape {

    private int x, y, width, height;

    public void draw(Canvas c) {

    }
}

class Canvas {

    public void draw(Shape s) {
        s.draw(this);
    }

    //  Any drawing will typically contain a number of shapes. 
    // Assuming that they are represented as a list, it would be convenient 
    // to have a method in Canvas that draws them all:
    public void drawAll(List<Shape> shapes) {
        for (Shape s : shapes) {
            s.draw(this);
        }
    }

    /*
    Now, the type rules say that drawAll() can only be called on lists of exactly Shape:
    it cannot, for instance, be called on a List<Circle>.
    That is unfortunate, since all the method does is read shapes from the list,
    so it could just as well be called on a List<Circle>.
    What we really want is for the method to accept a list of any kind of shape:

     */
    public void drawAllFixed(List<? extends Shape> shapes) {
    }

    /*
    List<? extends Shape> is an example of a bounded wildcard.
   The ? stands for an unknown type, just like the wildcards we saw earlier. 
   However, in this case, we know that this unknown type is in fact a subtype of Shape
     */
 /*
    Wildcards also have the advantage that they can be used outside of method signatures, 
    as the types of fields, local variables and arrays. Here is an example.

    Returning to our shape drawing problem, suppose we want to keep a history of drawing requests. 
    We can maintain the history in a static variable inside class Shape, 
    and have drawAll() store its incoming argument into the history field.
     */
    static List<List<? extends Shape>> history = new ArrayList<List<? extends Shape>>();

    public void drawAllStore(List<? extends Shape> shapes) {
        history.add(shapes);
        for (Shape s : shapes) {
            s.draw(this);
        }
    }

}
