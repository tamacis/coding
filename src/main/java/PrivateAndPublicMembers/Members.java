/*


 Class Car has public member name
 and private member engineno

 Public members can be accessed by dot noation or bracket notaion
 private memebers cant

*/

package PrivateAndPublicMembers;

class Car  {
    public String name;
    private int engineno;

    Car(String name, int engineno) {
        this.name = name;
        this.engineno = engineno;
    }
}

public class Members {

    public static void main(String[] args) {
        Car mustang = new Car("Mustang",3232);
        mustang.name = "Ferrari";
        // mustang.engineno = 14234;  ERROR!
        System.out.println(mustang.name);
    }
}