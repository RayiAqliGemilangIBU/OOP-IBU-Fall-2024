package lab4.shapes;

public class Shape {
    private String color;
    private FillType filled;

    public Shape(String aColor, FillType aFilledType){
        this.color = aColor;
        this.filled = aFilledType;
    }

    public void displayInfo(){
        System.out.println("Color : " + this.color + "\n status : " + this.filled);
    }
}
