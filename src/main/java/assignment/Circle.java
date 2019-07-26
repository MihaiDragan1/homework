package assignment;

import java.util.Objects;

public class Circle implements DrawingTool {
    private final double radius;
    final double pi = Math.PI;

      public Circle(double radius) {
          this.radius = radius;

      }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return radius == circle.radius;

    }

    @Override
    public  int hashCode() {
          return Objects.hash(radius);
    }

    @Override
    public double area() {

        return (pi * Math.pow(radius,2));
                    }

    @Override
                    public double perimeter() {

        return (2 * pi * radius);
                    }

}
