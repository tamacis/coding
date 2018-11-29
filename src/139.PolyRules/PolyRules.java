/*

    If a superclass method is public, then the subclass method must also be public. 
    Weaker access will cause a compiler error.

    If a superclass method is protected, then the subclass method can be either protected or public. 
    Weaker access will cause a compiler error.

    If a superclass method has no-access modifier, aka default access, then the subclass method 
    can be either default, protected, or public.
    Private access will cause a compiler error.

    If a superclass method is private, then the subclass method can be anything. 
    Overriding is NOT occurring in this case. Private methods are not visible and not inherited. 
    You would simply be declaring a new method in the subclass.

    The parameter list must be identical. If it is different, then you just created an overloaded method.

    If a superclass method is final, then the method cannot be overridden.

    The return type in the subclass must be the same (or a subtype - covariant return) as the superclass.

*/

class PolyRules {
    public static void main(String args[]) {
        ChildClass cc = new ChildClass();
        cc.iAmPublic();
        //cc.iAmProtected();
        //cc.iAmDefault();
        //cc.iAmPrivate(); // cannot invoke a private class via reference!

        //cc.differentParameter("Hello");
        //cc.differentParameter(9);
    }
}

class ParentClass {
    public void iAmPublic() { }
    protected void iAmProtected() { }
    void iAmDefault() { }
    private void iAmPrivate() { }

    public void differentParameter(String s) { System.out.println(s); }

    final void iAmFinal() { }

    int differentReturnType() { return 1; }
}

class ChildClass extends ParentClass {
    public void iAmPublic() { } // good
    //protected void iAmPublic() { } // weaker access 
    //void iAmPublic() { } // default weaker access 
    //private void iAmPublic() { } // weaker access 

    //public void iAmProtected() { } // good
    //protected void iAmProtected() { } // good
    //void iAmProtected() { } // default weaker access 
    //private void iAmProtected() { } // weaker access 

    //public void iAmDefault() { } // good
    //protected void iAmDefault() { } // good
    //void iAmDefault() { } // good
    //private void iAmDefault() { } // weaker access 

    //public void iAmPrivate() { } // not overridding
    //protected void iAmPrivate() { } // not overridding
    //void iAmPrivate() { } // not overridding
    //private void iAmPrivate() { } // not overridding

    //public void differentParameter(int i) { System.out.println( i * 3); } // overloaded, not overridden

    //final void iAmFinal() { }

    //double differentReturnType() { return 1; }
}