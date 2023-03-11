package shape;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println("Rectangle (4,5):");
        System.out.println("  Area = " + rectangle.getArea());
        System.out.println("  Perimeter = " + rectangle.getPerimeter());
    }
}
