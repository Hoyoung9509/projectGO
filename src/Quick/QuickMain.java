package Quick;

import java.util.Arrays;

public class QuickMain {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 3, 2};

        System.out.println("정렬 전 : "+Arrays.toString(arr));

        QuickSort.quicksort(arr, 0, arr.length -1);

        System.out.println("정렬 후 : "+Arrays.toString(arr));
    }


}
