
class StringOne {
    public static void main(String args[]) {
        StringOne si = new StringOne();
        System.out.println(si); // display heap memory location that si is refering to
        System.out.println("------\n");

        String one = "ABC";
        String two = one;
        String three = new String("DEF");
        

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println("one refers to: " + one.getClass().getName() + '@' + Integer.toHexString(one.hashCode()));
        System.out.println("two refers to: " + two.getClass().getName() + '@' + Integer.toHexString(two.hashCode()));
        System.out.println("three refers to: " + three.getClass().getName() + '@' + Integer.toHexString(three.hashCode()));

        System.out.println("\n-------");
        one = three;
        
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println("one refers to: " + one.getClass().getName() + '@' + Integer.toHexString(one.hashCode()));
        System.out.println("two refers to: " + two.getClass().getName() + '@' + Integer.toHexString(two.hashCode()));
        System.out.println("three refers to: " + three.getClass().getName() + '@' + Integer.toHexString(three.hashCode()));    

        System.out.println("\n-------");
        one = new String("GHI");
        
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println("one refers to: " + one.getClass().getName() + '@' + Integer.toHexString(one.hashCode()));
        System.out.println("two refers to: " + two.getClass().getName() + '@' + Integer.toHexString(two.hashCode()));
        System.out.println("three refers to: " + three.getClass().getName() + '@' + Integer.toHexString(three.hashCode()));   
    }
}
