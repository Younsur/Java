public class Triangle_Test {
    public static void main(String[] args) throws NotTriangleException {
        double x1 = 3.0,y1 = 4.0,z1 = 5.0;
        double x2 = 11.4,y2 = 5.14,z2 = 191.810;
        Triangle triangle1 = new Triangle(x1,y1,z1);
        Triangle triangle2 = new Triangle(x2,y2,z2);
        triangle1.showInfo();
        System.out.println(String.format("%.2f",triangle1.getArea()));
        triangle2.showInfo();
        System.out.println(triangle2.getArea());
    }
}
