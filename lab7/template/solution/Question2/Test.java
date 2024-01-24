import jdk.dynalink.beans.StaticClass;

interface Inter {
    void show();
}

class Outer {

    public static Inter method() {
        Inter inter = new Inter() {
            @Override
            public void show() {
                System.out.println("21371220");
            }
        };
        return inter;
    }
}

public class Test {
    public static void main(String[] args) {
        Outer.method().show();
    }
}
