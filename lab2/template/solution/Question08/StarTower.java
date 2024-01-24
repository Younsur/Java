public class StarTower {
    public static void main(String[] args) {
        char c = args[0].charAt(0);
        int n = c - '0';
        for (int i = 1; i <= n; i++) {
            if (i <= (n + 1) / 2){
                for (int j = 0; j < (n + 1) / 2 - i; j++) {
                    System.out.print(' ');
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
            }
            else{
                for (int j = 0; j < i - (n + 1) / 2; j++) {
                    System.out.print(' ');
                }
                for (int j = 0; j < 2 * n - 2 * i + 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
