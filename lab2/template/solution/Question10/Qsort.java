public class Qsort {
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

    public static int[] qsort(int[] arr){
        if (arr == null)
            return null;
        int n = arr.length;
        sort(arr,0,n-1);
        return arr;
    }
}
