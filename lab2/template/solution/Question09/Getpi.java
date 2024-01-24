import java.util.Scanner;

public class Getpi {
    public static double getPi(int n){
        if (n < 0)
            n = 0;
        double ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                ans += 1.0 / (2.0 * i + 1);
            else if (i % 2 == 1)
                ans += -1.0 / (2.0 * i + 1);
        }
        return 4.0 * ans;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        double pi;
        pi = getPi(n);
        System.out.printf("%.7f",pi);
    }
}
