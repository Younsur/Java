public class VarArgs {
    public static void main(String[] args) {
        f(1, 2);
        f(-1, -2, -3, -4); //��������ֵʱ��ʵ�εĸ��������
        f(9, 7, 6);
    }

    public static void f(int... x) {    //x�ǿɱ�����Ĵ����������ɸ�int�Ͳ���
        for (int i = 0; i < x.length; i++) {  //x.length��x����Ĳ����ĸ���
            System.out.println(x[i]);  //x[i]��x����ĵ�i������(��������)
        }
    }
}
