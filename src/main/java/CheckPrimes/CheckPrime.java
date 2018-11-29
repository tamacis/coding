/*
 * This class checks prime number
 */
public class CheckPrime {

 public static void main(String[] args) {
  System.out.println("7 is prime." + isPrime(7));
  System.out.println("9 is prime." + isPrime(9));
  System.out.println("69 is prime." + isPrime(69));

 }

 /*
  * Returns True if n is prime.
  */
 public static boolean isPrime(int n) {

  if (n == 2) {
   return true;
  }
  if (n == 3) {
   return true;
  }
  if (n % 2 == 0) {
   return false;
  }
  if (n % 3 == 0) {
   return false;
  }

  int i = 5;
  int w = 2;

  while (i * i <= n) {
   if (n % i == 0) {
    return false;
   }
   i += w;
   w = 6 - w;
   return true;
  }
  return false;
 }



}