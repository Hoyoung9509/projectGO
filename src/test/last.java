package test;

import java.util.Arrays;

public class last {

    public static void main(String[] args) {

        int[] arr = {5, 15, 17, 22, 4, 7, 42, 1};

        System.out.println(Arrays.toString(arr));

        sort(arr,0,arr.length -1);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr,int low,int last){
        if (low < last){
            int pivotinedex = partition(arr, low, last);

            sort(arr, low, pivotinedex -1);
            sort(arr, pivotinedex+1, last);

        }


    }

    public static int partition (int[] arr, int low, int last){
        int pivot = arr[low];

        int i = low;

        for (int j = low+1;j <= last; j++){
            if (pivot >= arr[j]){
                i++;
                Swap(arr, i, j);
            }
        }
        Swap(arr, low, i);
        return i;
    }

    public static void Swap (int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
