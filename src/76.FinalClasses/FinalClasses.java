class FinalClasses {
    public static void main(String args[]) {
        double totalPrice = 100.00D;
        // SalesPerson person = new SalesPerson("Bob", totalPrice); 
        // System.out.println(person.getName() + " made $" + person.getPayout() + " commission on a sale of $" + totalPrice );

        Commission pay = new Commission(totalPrice); // we can still create an object instance of a final class
        System.out.println("Bob made $" + pay.getPayout() + " commission on a sale of $" + totalPrice );
    }
}

final class Commission {
    private double payout = 0.0D;
    
    Commission() {
        super();
    }

    Commission(double salesPrice) {  
        payout = calculatePayout(salesPrice);
    }

    double calculatePayout(double salesPrice) { // implicity final
        return salesPrice * .3275; // 32.75% payout to sales person
    }

    double getPayout() { // implicitly final
        return payout;
    }
}


 class SalesPerson extends Commission { // Can't extend Commission because of final
    private String name = "";
    SalesPerson() {
        super();
    }
    SalesPerson(String name, double salesPrice) {
        super(salesPrice);
        this.name = name;
    }

    @Override
    double calculatePayout(double salesPrice) { // implicity final
      return salesPrice * .4275; // 42.75% payout to sales person
    }

    String getName() {
        return name;
    }
}
