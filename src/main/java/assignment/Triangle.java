package assignment;

public class Triangle extends DrawingTool {

    private final double a,b,c;

    public Triangle() {
        this(1,1,1);
            }

            public Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
