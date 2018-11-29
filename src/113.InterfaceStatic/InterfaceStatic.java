class InterfaceStatic {
    public static void main(String args[]) {
        new Mary();
        new Bobby().sellHouse();
    }
}

class Bobby implements GrandmasWill {

    @Override
    public boolean takeCareOfHoardingIssue() {
        System.out.println("Call family and sort through stuff ... no small task!");
        return true; // never ending task
    }
    @Override
    public void sellHouse() {
        int i = 1;
        while(takeCareOfHoardingIssue()) {
            System.out.println("Month "+i+" of sorting ...");
            i++;
            if (i==5) break;
        }
        System.out.println("Time to call a realtor.");
        spendInheritance();
    }
    @Override
    public void spendInheritance() {
        System.out.println("I\'m going on a vacation!\n");
    }
}

class Mary {
    static { GrandmasWill.catCareTrustFund("Mary"); }    
}

interface GrandmasWill {
    boolean takeCareOfHoardingIssue(); // decades of collections
    void sellHouse();
    public abstract void spendInheritance();

    static void catCareTrustFund(String volunteer) {
        System.out.println("Congratulations "+volunteer+", you were just awarded custody of 7 cats \nand a monthly stipend of $1000.00 for their care.\n");
    }
}
