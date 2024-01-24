class Point {
    int x, y;
    void setArgs(int m, int n) {
        x = m;
        y = n;
    }
}


public class PointTest {
    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point();
        p2 = new Point();
        System.out.println("p1������:" + p1);
        System.out.println("p2������:" + p2);
        p1.setArgs(1111, 2222);
        p2.setArgs(-100, -200);
        System.out.println("p1��x,y����:" + p1.x + "," + p1.y); // 1
        System.out.println("p2��x,y����:" + p2.x + "," + p2.y); // 2
        p1 = p2;
        p1.setArgs(0, 0);
        System.out.println("p1������:" + p1);
        System.out.println("p2������:" + p2);
        System.out.println("p1��x,y����:" + p1.x + "," + p1.y); // 3
        System.out.println("p2��x,y����:" + p2.x + "," + p2.y); // 4
    }
}
