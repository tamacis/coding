class FinalMethods {
    public static void main(String args[]) {
        double totalPrice = 100.00D;
        SalesPerson person = new SalesPerson("Bob", totalPrice);
        System.out.println(person.getName() + " made $" + person.getPayout() + " commission on a sale of $" + totalPrice );
    }
}

class Commission {
    private double payout = 0.0D;

    Commission() {
        super();
    }

    Commission(double salesPrice) {  
        payout = calculatePayout(salesPrice);
    }

    final double calculatePayout(double salesPrice) {
        return salesPrice * .3275; // 32.75% payout to sales person
    }

    double getPayout() {
        return payout;
    }
}


class SalesPerson extends Commission {
    private String name = "";

    SalesPerson() {
        super();
    }

    SalesPerson(String name, double salesPrice) {
        super(salesPrice);
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    double calculatePayout(double salesPrice) {
        return salesPrice * .4275; // 42.75% payout to sales person
    }
}


