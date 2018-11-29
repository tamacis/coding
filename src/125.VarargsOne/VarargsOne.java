/*
 * methodOrConstructorName( data-type ... referenceVariable )
 *
 * The arguments passed to the method must be of a compatible data type to the varargs data type declaration.
 * When invoking a method, the argument may be passed as an array or as a sequence of arguments.
 * You may have other parameters in the method parameter list, but only one varargs parameter
    and it must be the last parameter listed.
 * Methods may be overloaded with vararg parameters, but beware of a problematic situation 
    where an empty argument array or no arguments is passed.
 * Constructors may also be overloaded with vararg parameters, but beware of a problematic 
     situation where an empty argument array or no arguments is passed
 * A legal declaration for the main method can include varargs, for example, 
    public static void main(String ... args)
 *
*/

class VarargsOne {
    public static void main(String args[]) {
        Groupings group1 = new Groupings("Apple", "Orange", "Watermelon");
        Groupings group2 = new Groupings();
        group2.setItems("Tom", "Jane", "Bill", "Mary", "Johnny");
        Groupings group3 = new Groupings(); // empty argument list - interesting

        group1.displayItems();
        group2.displayItems();
        group3.displayItems();
    }
}

class Groupings {
    private String items[];

    Groupings(String ... items) { // Varargs in a constructor - legal, but be careful
        this.items = items;
    }            
    void displayItems() {
        for(String temp : items) {
            System.out.print(temp + "  ");
        }
        System.out.println();
    }

    void setItems(String ... items) { // Varargs in a method
        this.items = items;
    }
}
