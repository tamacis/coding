import java.util.List;
import java.util.Collections;

public class Triangle {
    private Double a;
    private Double b;
    private Double c;
    private boolean valid;
    private String reason;

    public Triangle(List<Double> sides) {
        Collections.sort(sides);
        this.a = sides.get(0);
        this.b = sides.get(1);
        this.c = sides.get(2);
        computeSides();
    }

    protected void computeSides() {
        if (a == 0 || b == 0 || c == 0) {
            reason = "one of the sides is zero.";
        }
        else if (a < 0 || b < 0 || c < 0) {
            reason = "one of the sides is negative.";
        }
        else if (a + b <= c) {
            reason = "such triangle cannot be formed.";
        }
        else {
            valid = true;
        }
    }

    public String getReason() {
        return  reason;
    }

    public boolean isValidTriangle() {
        return valid;
    }

    public Double getArea() {
        Double s=(a+b+c)/2;
        Double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
