package assignment;

import java.util.Objects;

public class Square implements DrawingTool {

    private final double side;

    public Square(double length) {
        this.side = length;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof Square)) {
            return false;
        }
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public double area() {
        return (Math.pow(side,2));
    }

    @Override
    public double perimeter() {
        return (4 * side);
    }

}
