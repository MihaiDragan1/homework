package assignment;

public class Rectangle extends DrawingTool {
    private final double width, length;

    public Rectangle() {
        this(5,10);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {

        return width * length;
    }
    @Override
                public double perimeter() {

            return 2 * (width + length);
        }
    }
