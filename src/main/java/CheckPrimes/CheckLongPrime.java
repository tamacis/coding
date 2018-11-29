/*
 * This class checks prime number
 */
public class CheckLongPrime {

    public static void main(String[] args) {


        long[] arr = {
                2147483647L,
                67280421310721L,
                9223372036854775805L,
                9223372036854775806L,
                Long.MAX_VALUE,
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " is prime." + isPrime(arr[i]));
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