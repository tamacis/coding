
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class EnergySource {}
class Vegetables extends EnergySource {}
class Bamboo extends Vegetables {}

class Entertainment{}
class Music extends Entertainment {}
class Metal extends Music {}
 
class Consumers {
    public static void Burner(List<? extends EnergySource> c) {
        // Consumer of anything that burns.
    }
    public static void Vegeterian(List<? extends Vegetables> v) {
        // Consumer of vegetables.
    }
    public static void Panda(List<? extends Bamboo> b) {
        // Consumer of bamboo..
    }
    
    public static void main(String[] args) {
        List<EnergySource> le = Arrays.asList(new EnergySource());
        List<Vegetables> lv = Arrays.asList(new Vegetables());
        List<Bamboo> lb = Arrays.asList(new Bamboo());
        
        Burner(le); // Can burn an energy source
        Burner(lv); // Can burn vegetables
        Burner(lb); // Can burn bamboos
        
//        Vegeterian(le); // Cannot eat energy source
        Vegeterian(lv); // Can eat vegetables.
        Vegeterian(lb); // Can eat bamboos.
        
//        Panda(le); // Cannot eat energy source
//        Panda(lv); // Cannot eat vegetables
        Panda(lb); // Can eat bamboo
    }
}

class Producers {
    static List<Entertainment> le = new ArrayList<>();
    static List<Music> lm = new ArrayList<>();
    static List<Metal> lme = new ArrayList<>();
    
    public static List<? super Entertainment> Juggler(int c) {
        
        if (c == 1)  return le; // Can return entertainment
//        if (c == 2)  return lm; // Cannot return music
//        if (c == 3)  return lme; // Cannot return metal
        return null;
    }
    public static List<? super Music> Opera(int c) {
        if (c == 1)  return le; // Can return entertainment
        if (c == 2)  return lm; // Can return music
//              return lme; // Cannot return metal
        return null;
    }    
    
    public static List<? super Metal> MetalBand(int c) {
        if (c == 1)  return le; // Can return entertainment
        if (c == 2)  return lm; // Can return music
        if (c == 3)  return lme; // Cannot return metal
        return null;
    }
    
    public static void main(String[] args) {
        List<? super Entertainment> le = Juggler(1);
        
        List<? super Music> lm = Opera(1);
    }
}

/*
I see the problem... 

In Java the Producers are Consumers are inversed  
Since Java Generics aren't declaration site, but call site...
The get(producer) and put(consumer) are from Collection prespective

From, declaration site perspective: 

we accepts a List of Number or its subtypes, hence we are "consuming" the List
    void read(List<? extends Number> l) 

we return a List of Integer or its supertypes, hence we are "producing" a List
NOTE: In java, it is generally the case that you never return a wildcard type:
    List<? super Integer> make()

From, call site prespective: 

the method is "reading" from a list, 
    read(listOfNumbers)

the method is "putting" to the List
    addAll(
*/

class ProducerConsumer {
    public static void read(List<? extends Number> l) {
        // Consumer of List<? extends Number>
        for(Number n : l ) {
            System.out.println(n.doubleValue()); 
        }
        // Cannot add anything to the list.
//        l.add(0);
    }
        public static List<? super Integer> make() {
            return Arrays.asList(1,3,"5.0");
        }
}