import java.util.Random;
import java.util.Scanner;

public class Search {
    public static void sort(int[] arr,int start,int end){
        if (start >= end)
            return;

        int left = start;
        int right = end;
        int key = start;
        int temp;
        while(start < end){
            while(arr[end] >= arr[key] && start < end){
                --end;
            }
            while(arr[start] <= arr[key] && start < end){
                ++start;
            }
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        temp = arr[end];
        arr[end] = arr[key];
        arr[key] = temp;
        key = end;

        sort(arr,left,key);
        sort(arr,key+1,right);
    }

    public static int Search(int n,int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {12,45,67,89,123,-45,67};
        sort(a,0,6);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int flag;
        flag = Search(n,a);
        if (flag == 1)
            System.out.println("yes");
        else if (flag == 0)
            System.out.println("no");
    }
}
