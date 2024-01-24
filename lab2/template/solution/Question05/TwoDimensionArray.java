public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] b = {{11}, {21, 22}, {31, 32, 33}};
        int sum = 0;
        b[0][0] = 1000;
        for(int[] ints : b) {
            for(int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println("b[0][0]=" + b[0][0] + '\n' + "sum=" + sum + '\n'
                + "b.length=" + b.length);

        int[][] arr1 = new int[3][4];
        int[][] arr2 = new int[3][];
        int[][] arr3 = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int i, j, k = 0;

        // arr1[][]��ֵ
        for(i = 0; i < 3; i++) {
            // arr1Ϊ3��4��
            for(j = 0; j < 4; j++) {
                arr1[i][j] = k++;
            }
        }

        // arr2[][]�����ڴ�ռ�
        for(i = 0; i < 3; i++) {
            // arr2ÿһ���Ǳ䳤�ģ�Ԫ�ظ���Ϊ3��4��5
            arr2[i] = new int[i + 3];
        }

        // arr2[][]��ֵ
        for(i = 0; i < 3; i++) {
            for(j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = k++;
            }
        }

        // ���arr1
        System.out.println(" arr1:");
        for(i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(" " + arr1[i][j]);
            }
        }

        System.out.println();

        // ���arr2
        System.out.println(" arr2:");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < arr2[i].length; j++) {
                System.out.println(" " + arr2[i][j]);
            }
        }

        // ���arr3
        System.out.println(" arr3:");
        for(i = 0; i < 3; i++) {
            // arr3Ϊ3��3��
            for(j = 0; j < 3; j++) {
                System.out.print(" " + arr3[i][j]);
            }
        }
    }
}
