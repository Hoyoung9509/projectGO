package Quick;

public class Partition {
    public static int partition(int[] arr, int first, int last){
        int pivot = arr[first];
        int i = first;

        for(int j= first+1; j<= last; j++){
            if(arr[j] <= pivot){
                i++;
                swap.swapping(arr, i, j);
            }
        }
        swap.swapping(arr, first, i);
        return i;
    }
}
