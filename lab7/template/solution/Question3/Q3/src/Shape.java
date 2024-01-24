import java.util.Scanner;
interface IShapeFactory {
    Shape makeShape(double a, double b) throws Exception;
}
public abstract class Shape {
        protected double a;
        protected double b;

        public Shape() { this(0.0, 0.0); }
        public Shape(double a, double b) {
            this.a = a;
            this.b = b;
        }

        /** calcArea
         * 计算形状的面积
         * @return 面积
         */
        abstract public double calcArea();

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    /* 其他必要的方法，比如 getter 和 setter */
}

class Rectangle extends Shape {
    private static IShapeFactory factory;
    public static IShapeFactory fac() {
        factory = (a, b) -> {
            if (a < 0 || b < 0) {
                throw new Exception("num is illegal");
            }
            else {
                Rectangle rectangle = new Rectangle();
                rectangle.setA(a);
                rectangle.setB(b);
                return rectangle;
            }
        };
        return factory;
    }

    @Override
    public double calcArea() {
        return getA() * getB();
    }
}

class Rhombus extends Shape {
    private static IShapeFactory factory;
    public static IShapeFactory fac() {
        factory = (a, b) -> {
            if (a < 0 || b < 0) {
                throw new Exception("num is illegal");
            }
            else {
                Rhombus rhombus = new Rhombus();
                rhombus.setA(a);
                rhombus.setB(b);
                return rhombus ;
            }
        };
        return factory;
    }
    @Override
    public double calcArea() {
        return getA() * getB() / 2;
    }
}

class Ellipse extends Shape {
    private static IShapeFactory factory;
    public static IShapeFactory fac() {
        factory = (a, b) -> {
            if (a < 0 || b < 0) {
                throw new Exception("num is illegal");
            }
            else {
                Ellipse ellipse = new Ellipse();
                ellipse.setA(a);
                ellipse.setB(b);
                return ellipse;
            }
        };
        return factory;
    }
    @Override
    public double calcArea() {
        return 3.14 * getA() * getB();
    }
}


