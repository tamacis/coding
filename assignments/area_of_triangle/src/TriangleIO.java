import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TriangleIO {
    public List<Double> getUserInput() {
        Scanner scnr= new Scanner(System.in);

        System.out.println("Enter the sides of the triangle:");
        List<Double> sides = new ArrayList<Double>();
        sides.add(scnr.nextDouble());
        sides.add(scnr.nextDouble());
        sides.add(scnr.nextDouble());
        return sides;
    }
    public void showOutput(Double area) {
        System.out.println("The area of triangle is " + area + ".");
    }
    public void showError(String reason) {
        System.out.println("Error: " + reason);
    }
}
