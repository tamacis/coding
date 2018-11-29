// Generics: 


// Account class and it's spend method can work with any of
// the Byte, Short, Integer or Long as they are subclasses of Number
// While being type safe, having compile time checking 

class Account <T extends Number> {
    T balance;
    
    Account(T balance) {
        this.balance = balance;
    }

    void spend(T amount) {
     double rem = balance.doubleValue() -  amount.doubleValue();
     System.out.println("Remaining balance " + rem) ; 
    };
}


public class Generics {

    public static void main(String[] args) {

        Account<Byte> a1 = new Account<>((byte) 100);
        a1.spend((byte) 40);
        Account<Short> a2 = new Account<>((short) 200);
        a2.spend((short) 120);
        Account<Integer> a3 = new Account<>(300);
        a3.spend(260);
        Account<Long> a4 = new Account<>(1000L);
        a4.spend(590L);
    }

}