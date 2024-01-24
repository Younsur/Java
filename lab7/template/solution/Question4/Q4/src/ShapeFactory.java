import java.util.Random;

enum ShapeType {
    RECTANGLE(1),RHOMBUS(2),ELLIPSE(3);
    private int num;
    ShapeType(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
public class ShapeFactory {
    public Shape makeShape(ShapeType type,double a,double b) {
        if (type == ShapeType.RECTANGLE) {
            if (a < 0 || b < 0){
                return null;
            }
            else {
                Rectangle rectangle = new Rectangle();
                rectangle.setA(a);
                rectangle.setB(b);
                return rectangle;
            }
        }
        else if (type == ShapeType.RHOMBUS) {
            if (a < 0 || b < 0){
                return null;
            }
            else {
                Rhombus rhombus = new Rhombus();
                rhombus.setA(a);
                rhombus.setB(b);
                return rhombus;
            }
        }
        else if (type == ShapeType.ELLIPSE){
            if (a < 0 || b < 0){
                return null;
            }
            else {
                Ellipse ellipse = new Ellipse();
                ellipse.setA(a);
                ellipse.setB(b);
                return ellipse;
            }
        }
        return null;
    }
    public Shape randomNextShape() {
        Random random = new Random();
        int index = random.nextInt(3) + 1;
        double a = (double) random.nextInt(10) + 2.0;
        double b = (double) random.nextInt(10) + 2.0;
        ShapeType shapeType = ShapeType.RECTANGLE;
        shapeType.setNum(index);
        switch (shapeType.getNum()){
            case 1 -> {
                Rectangle rectangle = new Rectangle();
                rectangle.setA(a);
                rectangle.setB(b);
                return rectangle;
            }
            case 2 -> {
                Rhombus rhombus = new Rhombus();
                rhombus.setA(a);
                rhombus.setB(b);
                return rhombus;
            }
            case 3 -> {
                Ellipse ellipse = new Ellipse();
                ellipse.setA(a);
                ellipse.setB(b);
                return ellipse;
            }
        }
        return null;
    }
}
