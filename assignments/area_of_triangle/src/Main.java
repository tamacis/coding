public class Main {
    public static void main(String[] args) {
        TriangleIO io = new TriangleIO();
        Triangle t = new Triangle(io.getUserInput());

        if(!t.isValidTriangle()) {
            io.showError(t.getReason());
        }
        else {
            io.showOutput(t.getArea());
        }
    }
}
