package lab4.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(FillType fillType, String color, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }
}

