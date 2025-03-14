package Quick;

public class QuickSort {

    public static void quicksort(int[] arr, int first, int last){
        if (first < last){
            int pivotIndex = Partition.partition(arr, first, last);

            quicksort(arr, first, pivotIndex -1);
            quicksort(arr, pivotIndex+1, last);
        }


    }
}
