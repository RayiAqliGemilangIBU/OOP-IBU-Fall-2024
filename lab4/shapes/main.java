package lab4.shapes;

public class main {
    public static void main(String[] args) {
        System.out.println("Circle: ");
        Circle circle = new Circle( FillType.FILLED, "blue", 5);
        circle.displayInfo();

        double circumference = circle.calculateCircumference(circle.radius);
        System.out.println("Circumference: " + circumference);

        System.out.println("Rectangle: ");
        Rectangle rectangle = new Rectangle(FillType.NOT_FILLED, "green", 4, 6);
        rectangle.displayInfo();

    }
}
