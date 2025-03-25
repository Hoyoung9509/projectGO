package test;

import java.util.*;

public class bbb {
    public static void main(String[] args) {
        int[] arr = {5, 32, 3, 34, 7, 25};

        System.out.println(Arrays.toString(arr));

        sort(arr, 0, arr.length -1);

        System.out.println(Arrays.toString(arr));


    }

    public static void sort (int[] arr,int low,int high){
        if (low < high) {
            int pivotindex = part(arr, low, high);

            sort(arr, low, pivotindex -1);
            sort(arr, pivotindex+1, high);
        }
    }

    public static int part(int[] arr, int low, int high){
        int mid = low + (high-low)/2;

        swap(arr, low, mid);
        int pivot = arr[low];
       int i = low;

       for (int j = low+1; j <= high; j++){
           if (pivot >= arr[j]){
               i++;
               swap(arr, i, j);
           }
       }
       swap(arr, low, i);
       return  i;

    }

    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
