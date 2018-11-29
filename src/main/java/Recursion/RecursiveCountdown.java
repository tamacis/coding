
public class RecursiveCountdown {

    static void countDown(final int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        countDown(n - 1 );
    }

    public static void main(String[] args) {

        countDown(10);
    }
}
