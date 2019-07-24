package assignment;

public class Square extends DrawingTool {

    private final double side;

    public Square() {
        this(5);
    }
    public Square( double length) {
               this.side = length;
    }

    @Override
    public double area() {

        return Math.pow(side,2);
    }
    @Override
    public double perimeter() {

        return 4 * side;
    }
}
