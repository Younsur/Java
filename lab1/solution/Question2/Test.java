import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("21371220");
        System.out.println("杨硕");
        while (true){
            Scanner scanner = new Scanner();
            String str = scanner.next();
            if (str.equals("QUIT")){
                System.out.println("----- Good Bye! -----");
                System.exit(0);
            }
            else {
                System.out.println("Hello World!");
            }
        }
    }
}
