package assignment;


import java.util.ArrayList;

public class TestDrawingTool {
    double perimeter;
    double area;
    ArrayList<Double> perimeters = new ArrayList<>();
    ArrayList<Double> areas = new ArrayList<>();
    ArrayList<DrawingTool> drawingTools = new ArrayList<>();

    public void addshape(DrawingTool shape) {
        drawingTools.add(shape);

    }
  public void calculate() {
        for (DrawingTool shape : drawingTools) {
            this.perimeter = shape.perimeter();
            perimeters.add(perimeter);
            this.area = shape.area();
            areas.add(area);
        }
        double sum = 0;
        for (Double d : perimeters)
            sum += d;
        System.out.println("Perimeters'sum:" + (sum));
        double sum2 = 0;
        for (Double d1 : areas)
            sum2 += d1;
        System.out.println("Areas'sum:" + (sum2));
    }


    public static void main(String[] args) {
        TestDrawingTool calculation = new TestDrawingTool();


        // Rectangle test

        Rectangle r = new Rectangle(3, 4);
        calculation.addshape(r);
        System.out.println("Rectangle's perimeter is:" + (r.perimeter()));
        System.out.println("Rectangle's area is:" + (r.area()));

        Rectangle r1 = new Rectangle(10, 4);
        System.out.println("There is a duplicate:"+(r1.equals(r)));


        // Square test

        Square s = new Square(10);
        calculation.addshape(s);
        System.out.println("Square's perimeter is:" + (s.perimeter()));
        System.out.println("Square's area is:" + (s.area()));


        Square s1 = new Square(10);
        System.out.println("There is a duplicate:"+(s1.equals(s)));


        // Circle test

        Circle c = new Circle(1);
        calculation.addshape(c);
        System.out.println("Circle perimeter is: " + (c.perimeter()));
        System.out.println("Circle area is :" + (c.area()));

        Circle c1 = new Circle(5);
        calculation.addshape(c1);
        System.out.println("Circle perimeter is: " + (c1.perimeter()));
        System.out.println("Circle area is :" + (c1.area()));

        System.out.println("There is a duplicate:"+(c1.equals(c)));


        // Triangle test

        Triangle t = new Triangle(1, 2, 3);
        calculation.addshape(t);
        System.out.println("Triangle's perimeter is:" + (t.perimeter()));
        System.out.println("Triangle's area is:" + (t.area()));

        Triangle t1 = new Triangle(1, 2, 3);
        calculation.addshape(t1);
        System.out.println("Triangle's perimeter is:" + (t1.perimeter()));
        System.out.println("Triangle's area is:" + (t1.area()));

        System.out.println("There is a duplicate:"+(t1.equals(t)));

    calculation.calculate();
    }
}
