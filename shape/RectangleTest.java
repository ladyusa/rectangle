package shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        double area = rectangle.getArea();
        double EXPECTED_VALUE = 200;

        System.out.println("Test Area: ");
        System.out.println("  Rectangle (10,20) ");
        System.out.println("  Expected: " + EXPECTED_VALUE);
        System.out.println("  Actual: " + area);
        if (EXPECTED_VALUE == area)
            System.out.println("Pass");
        else
            System.err.println("Fail");
    }
}
