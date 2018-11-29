import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.DoublePredicate;
import java.util.function.UnaryOperator;

public class LambdaFI {

    public static void main(String[] args) {
        UnaryOperator<Integer> tripleIt = (x) -> x * 3;
        System.out.println("tripleIt(10) = " + tripleIt.apply(10));

        BiPredicate<Integer,Integer> isGreater = (x, y) -> (x > y );
        System.out.println("isGreater(2,3) = " + isGreater.test(2, 3));
        System.out.println("isGreater(5,3) = " + isGreater.test(5, 3));

        BinaryOperator<Double> sum = (a, b) -> a + b;
        System.out.println("sum(5.0, 6.1)" + sum.apply(5.0, 6.1));

        DoublePredicate isPi = (x) -> x == 3.14;
        System.out.println(isPi.test(3.14));
        System.out.println(isPi.test(3.14152));
    }
}
