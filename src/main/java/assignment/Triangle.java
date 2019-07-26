package assignment;

import java.util.Objects;

public class Triangle implements DrawingTool {

    private final double a,b,c;

            public Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
          }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Triangle)) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c;

    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public double area() {
        double s = perimeter()/ 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
          }
@Override
    public double perimeter() {

        return  a + b + c;
}

}
