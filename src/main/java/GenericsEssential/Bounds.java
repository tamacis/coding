package GenericsEssential;

interface Entity {
    Integer getId();
}

class Person implements  Entity {
    @Override
    public Integer getId() {
        return 0;
    }
}

//Bounds are used to make sure that generic parameters are of a specified subtype.

// The generic parameter of Query must extend (or implement) Entity and Entity must have a getId method!
class Dao<T extends Entity> {
    T createOrUpdate(T entity) {
        if (entity.getId() != null) {
            return update(entity);
        } else {
            return create(entity);
        }
    }
}

public class Bounds {
    public static void main(String[] args) {
        // Using Dao
        Dao<Person> personDao = new Dao<Person>(); // Works fine since Person extends Entity!
//        Dao<String> stringDao = new Dao<String>(); // Wont compile since String does not extend Entity!

    }
}
