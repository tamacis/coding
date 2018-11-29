
import java.util.ArrayList;
import java.util.List;


interface H {}
interface I extends H {
    void foo();
}

class A {}
class B extends A implements I {
@Override
public void foo(){};
}

class SuperInterfaceWildcard {
    public  static <T> void methodDemo(List<? super T> li) {
        System.out.println(li);
        for(Object elem : li ) {
            
        }
    }
    
    public static void main(String[] args) {
        // You can pass in any class implementing the interface
        // Or the superclass of the implementing interface
        
        List<B> lb = new ArrayList<>();
        methodDemo(lb);
        List<A> la = new ArrayList<>();
        methodDemo(la);
        
        // You can pass the interface or 
        // the superclass of the interfae
        List<I> li = new ArrayList<>();
        methodDemo(li);
        List<H> lh = new ArrayList<>();
        methodDemo(lh);
        
        // You can pass List<Object>
        List<Object> lo = new ArrayList<>();
        methodDemo(lo);
    }
}