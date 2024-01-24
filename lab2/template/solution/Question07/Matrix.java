public class Matrix {
    public static void main(String[] args) {
        char c = args[0].charAt(0);
        int n = c - '0';
        System.out.println(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               System.out.print(n * (i - 1) + j + " ");
            }
            System.out.println("");
        }
    }
}
