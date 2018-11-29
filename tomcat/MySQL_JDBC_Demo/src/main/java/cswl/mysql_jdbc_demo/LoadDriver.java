package cswl.mysql_jdbc_demo;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!
public class LoadDriver {

    public static void load()
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // The newInstance() call is a work around for some
        // broken Java implementations
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

    }
}
