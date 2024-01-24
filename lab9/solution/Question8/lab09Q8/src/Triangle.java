class NotTriangleException extends Exception {
    public NotTriangleException(){

    }
    public NotTriangleException(String s){
        super(s);
    }
}
public class Triangle {
    double x;
    double y;
    double z;
    public Triangle(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getArea() throws NotTriangleException{
        double average = (x + y + z) / 2.0;
        if (x + y <= z || x + z <= y || y + z <= x) {
            throw new NotTriangleException("NotTriangleException");
        }
        else {
            return Math.sqrt(average * (average - x) * (average - y) * (average -z));
        }
    }

    public void showInfo() throws NotTriangleException{
        if (x + y <= z || x + z <= y || y + z <= x) {
            throw new NotTriangleException("NotTriangleException");
        }
        else {
            System.out.println("triangle.x="+x+" "+"triangle.y="+y+" "+"triangle.z="+z);
        }
    }


}
