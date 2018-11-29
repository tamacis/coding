
import java.util.ArrayList;
import java.util.Collection;

/* Class Literals as Runtime-Type Tokens */

 /*
The class java.lang.Class is generic.
Now that Class has a type parameter T, you might well ask, what does T stand for? 
It stands for the type that the Class object is representing.

For example, the type of String.class is Class<String>, and the type 
of Serializable.class is Class<Serializable>. 
This can be used to improve the type safety of your reflection code.

In particular, since the newInstance() method in Class now returns a T, 
you can get more precise types when creating objects reflectively.
 */

 /*
For example, suppose you need to write a utility method that performs a database 
query, given as a string of SQL, and returns a collection of objects in the
database that match that query.

One way is to pass in a factory object explicitly, writing code like:
 */
interface Factory<T> {

    T make();
}

class RuntimeTypeToken {

    public <T> Collection<T> select(Factory<T> factory, String statement) {
        Collection<T> result = new ArrayList<T>();

        /* Run sql query using jdbc */
        for (int i = 0; i < 1; ++i) {
            T item = factory.make();
            /* Use reflection and set all of item's 
         * fields from sql results. 
             */
            result.add(item);
        }
        return result;
    }

    class EmpInfo {
    }
//    You can call this either as

    {
        select(new Factory<EmpInfo>() {
            public EmpInfo make() {
                return new EmpInfo();
            }
        }, "selection string");
    }

//or you can declare a class EmpInfoFactory to support the Factory interface
    class EmpInfoFactory implements Factory<EmpInfo> {

        public EmpInfo make() {
            return new EmpInfo();
        }
    }

    /*
    The downside of this solution is that it requires either:

    the use of verbose anonymous factory classes at the call site, or
    declaring a factory class for every type used and passing a factory instance
    at the call site, which is somewhat unnatural.

     */
 /*
    It is natural to use the class literal as a factory object, which can then 
    be used by reflection. Without generics the code might be written:
     */
    public void callSelect() throws Exception {
        Collection emps = select(EmpInfo.class, "select * from emps");

    }

    public static Collection select(Class c, String sqlStatement) throws Exception {
        Collection result = new ArrayList();
        /* Run sql query using jdbc. */
        for (int i = 0; i < 1; ++i) {
            Object item = c.newInstance();
            /* Use reflection and set all of item's
         * fields from sql results. 
             */
            result.add(item);
        }
        return result;
    }

    /*
    However, this would not give us a collection of the precise type we desire. 
    Now that Class is generic, we can instead write the following:
     */
    public void callSelectGeneric() throws Exception {
        Collection<EmpInfo> emps = select(EmpInfo.class, "select * from emps");
    }

    public static <T> Collection<T> selectGenric(Class<T> c, String sqlStatement) {
        Collection<T> result = new ArrayList<T>();
        /* Run sql query using jdbc. */
        for (int i = 0; i < 1; ++i) {
            try {
                T item = c.newInstance();
                /* Use reflection and set all of item's
         * fields from sql results. 
                 */
                result.add(item);
            } catch (Exception e) {

            }

        }
        return result;
    }

}
