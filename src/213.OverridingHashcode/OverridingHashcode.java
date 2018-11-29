
class OverridingHashcode {
    public static void main(String args[]) {
        CokeSixPack sixPackOne = new CokeSixPack(1.98);
        CokeSixPack sixPackTwo = new CokeSixPack(.99);
        CokeSixPack sixPackThree = sixPackOne;

        System.out.println("sixPackOne hashCode = " + sixPackOne.hashCode()); 
        System.out.println("sixPackTwo hashCode = " + sixPackTwo.hashCode());
        System.out.println("sixPackThree hashCode = " + sixPackThree.hashCode());
        System.out.println();

        CokeTwelvePack twelvePackOne = new CokeTwelvePack(3.48);
        CokeTwelvePack twelvePackTwo = new CokeTwelvePack(1.49);
        System.out.println("twelvePackOne hashCode = " + twelvePackOne.hashCode()); 
        System.out.println("twelvePackTwo hashCode = " + twelvePackTwo.hashCode());
        System.out.println();

        //twelvePackOne.setPrice(4.99);
        //System.out.println("\ntwelvePackOne hashCode = " + twelvePackOne.hashCode()); 

        //for (int i = 0; i < 10; i++) {
        //	System.out.println("twelvePackOne hashCode = " + twelvePackOne.hashCode()); 
        //}

    }
}

class CokeSixPack {
    double price;

    CokeSixPack(double price){
        this.price = price;
    }

    @Override
    public int hashCode() {
        return 568269686;
    }
}

class CokeTwelvePack {
    double price;

    CokeTwelvePack(double price){
        this.price = price;
    }

    @Override
    public int hashCode() {
        return 568269686;
    }
}

/*class CokeSixPack {
    double price;

    CokeSixPack(double price){
        this.price = price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return (int)(price*41);
        //return (int)(price*41)+(int)System.currentTimeMillis();
    }
}

class CokeTwelvePack {
    double price;

    CokeTwelvePack(double price){
        this.price = price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return (int)(price*107);
        //return (int)(price*107)+(int)System.currentTimeMillis();
    }
}
*/

