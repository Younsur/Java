import java.util.Scanner;

public class Test2 {
    public static boolean judge1(String num){
        String num1 = "\\d+";
        return num.matches(num1);
    }
    public static boolean judge2(String num){
        String num2 = "[1-9]\\d+";
        return num.matches(num2);
    }
    public static void main(String[] args) {
        String num;
        String bnum = "";
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextLine();
        char[] nums = num.toCharArray();
        char[] bnums = new char[nums.length + 2];
        if (nums.length == 1){
            if (nums[0] >= '0' && nums[0] <= '9'){
                System.out.println("��û��ǰ��0���޷������������ǻ�����");
            }
            else {
                System.out.println("����û��ǰ��0���޷�������");
            }
        }
        else if (nums.length > 1){
            if (!judge1(num)){
                System.out.println("����û��ǰ��0���޷�������");
            }
            else {
                if (!judge2(num)){
                    System.out.println("����ǰ��0���޷�������");
                }
                else {
                    for (int i = 0; i < nums.length; i++) {
                        bnums[i] = nums[nums.length - i - 1];
                    }
                    for (int i = 0; i < nums.length; i++) {
                        if (bnums[i] != nums[i]){
                            System.out.println("��û��ǰ��0���޷�������,���ǻ�����");
                            System.exit(0);
                        }
                    }
                    System.out.println("��û��ǰ��0���޷�������,���ǻ�����");
                }
            }
        }
    }
}
