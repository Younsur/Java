// Test.java
interface I0 {
    void f(); // Ĭ���� abstract public ��
}

interface I1 extends I0{
    void f();
}

interface I2 {
    int a = 2; // Ĭ���� static public final ��

    int f();
}

interface I3 extends I0{
    int a = 3;

    int f(int i);
}

interface I4 {
    void f(int i);
}

class Test01 implements I0, I1 {
    @Override
    void f() {
    }
}

class Test02 implements I0, I2 {
    @Override
    void f() {
    }

    @Override
    int f() {
        return 0;
    }
}

class Test23 implements I2, I3 {
    @Override
    int f() {
        return a;
    }

    @Override
    int f(int i) {
        return i;
    }
}
public class Test {
    public static void main(String[] args) {

    }
}
