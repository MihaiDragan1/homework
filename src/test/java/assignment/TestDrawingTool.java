package assignment;

import java.util.ArrayList;
import java.util.List;

public class TestDrawingTool {
    public static void main(String[] args) {


        // Rectangle test
        double width = 5, length = 7;
        DrawingTool rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Square test
        double side = 4;
        DrawingTool square = new Square(side);
        System.out.println("Square side: " + side
                + "\nResulting area: " + square.area()
                + "\nResulting perimeter: " + square.perimeter() + "\n");

        // Circle test
        double radius = 5;
        DrawingTool circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.area()
                + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        // Triangle test
        double a = 5, b = 3, c = 4;
        DrawingTool triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");


        List<DrawingTool> shapes = new ArrayList<>();
        shapes.add(new Rectangle(1.0, 2.0));
        shapes.add(new Circle(5.0));
        for (DrawingTool shape : shapes){
            System.out.println(shape.perimeter()); // every Shape will do it their own way
        }

    }
}
