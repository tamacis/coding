
import java.math.BigInteger;


/*
 * This class checks prime number
 */
public class CheckBigIntPrime {

    public static void main(String[] args) {

	  BigInteger ba [] = new BigInteger[6];

	ba[0] = new BigInteger(Long.MAX_VALUE + "");
        ba[1] = new BigInteger("67280421310721");
	ba[2] = new BigInteger("170141183460469231731687303715884105727");
	ba[3] = new BigInteger("20988936657440586486151264256610222593863921");
	ba[4] = new BigInteger("1606938044258990275541962092341162602522202993782792835301376");
	ba[5] =new BigInteger("2582249878086908589655919172003011874329705792829223512830659356540647622016841194629645353280137831435903171972747493376");
        for (int i = 0; i < ba.length; i++) {
            System.out.println(ba[i] + " is prime? " + ba[i].isProbablePrime(1) );
        }
    }

    /*
     * Returns True if n is prime.
     */
    public static boolean isPrime(long n) {

        if (n == 2 || n == 3) return true;
        if ((n & 1) == 0 || n % 3 == 0) return false;
        long limit = (long) Math.sqrt(n) + 1L;
        for (long i = 5, w = 2; i <= limit; i += w, w = 6 - w) {
            if (n % i == 0) return false;

        }
        return true;


    }

}