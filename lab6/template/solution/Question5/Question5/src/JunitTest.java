import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JunitTest {
    @Test
    public void Test1() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double a = scanner1.nextDouble();
        double b = scanner2.nextDouble();
        if (a < 0 || b < 0){
            Rectangle rectangle = new Rectangle();
            Rhombus rhombus = new Rhombus();
            Ellipse ellipse = new Ellipse();
            rectangle.setA(0.0);
            rectangle.setB(0.0);
            rhombus.setA(0.0);
            rhombus.setB(0.0);
            ellipse.setA(0.0);
            ellipse.setB(0.0);
            System.out.println(rectangle.calcArea());
            System.out.println(rhombus.calcArea());
            System.out.println(ellipse.calcArea());
        }
        else if (a >= 0 && b >= 0){
            Rectangle rectangle = new Rectangle();
            Rhombus rhombus = new Rhombus();
            Ellipse ellipse = new Ellipse();
            rectangle.setA(a);
            rectangle.setB(b);
            rhombus.setA(a);
            rhombus.setB(b);
            ellipse.setA(a);
            ellipse.setB(b);
            System.out.println(rectangle.calcArea());
            System.out.println(rhombus.calcArea());
            System.out.println(ellipse.calcArea());
        }
    }
    @Test
    public void Test2() {
        List<Shape> shapes = new ArrayList<>();
        double a;
        double b;
        ShapeFactory shapeFactory = new ShapeFactory();
        for (int i = 1; i <= 5; i++) {
            a = i;
            b = i + 1;
            if (i == 1) {
                Shape shape = shapeFactory.makeShape(ShapeType.RECTANGLE,a,b);
                shapes.add(shape);
            }
            else if (i == 2 || i == 4) {
                Shape shape = shapeFactory.makeShape(ShapeType.RHOMBUS,a,b);
                shapes.add(shape);
            }
            else {
                Shape shape = shapeFactory.makeShape(ShapeType.ELLIPSE,a,b);
                shapes.add(shape);
            }
        }
        for (int i = 1; i <= 5; i++) {
            Shape shape = shapeFactory.randomNextShape();
            shapes.add(shape);
        }
        for (Shape shape: shapes) {
            System.out.println(shape.calcArea());
        }
    }
    @Test
    public void Test3() throws Exception {
        List<Shape> shapes = new ArrayList<>();
        double a;
        double b;
        for (int i = 0; i < 5; i++) {
            a = (i + 1.0);
            b = (i + 4.0);
            if (i == 1) {
                Shape shape = Rectangle.fac().makeShape(a,b);
                shapes.add(shape);
            }
            else if (i == 2 || i == 4) {
                Shape shape = Rhombus.fac().makeShape(a,b);
                shapes.add(shape);
            }
            else {
                Shape shape = Ellipse.fac().makeShape(a,b);
                shapes.add(shape);
            }
        }
        for (Shape shape: shapes) {
            System.out.println(shape.calcArea());
        }
    }
    @Test
    public void Test4() throws Exception{
        ShapeSequence shapeSequence = new ShapeSequence(5);
        double a;
        double b;
        for (int i = 0; i < 5; i++) {
            a = (i + 1.0);
            b = (i + 4.0);
            if (i == 1) {
                Shape shape = Rectangle.fac().makeShape(a,b);
                shapeSequence.add(shape);
            }
            else if (i == 2 || i == 4) {
                Shape shape = Rhombus.fac().makeShape(a,b);
                shapeSequence.add(shape);
            }
            else {
                Shape shape = Ellipse.fac().makeShape(a,b);
                shapeSequence.add(shape);
            }
        }
        System.out.println(shapeSequence.toString());
        shapeSequence.print();
    }
}
