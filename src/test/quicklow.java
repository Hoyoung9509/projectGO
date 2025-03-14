package test;

import java.util.Arrays;

public class quicklow {

    public static void main(String[] args) {

        int[] arr = { 23, 12, 53, 14, 13, 16};

        System.out.println("정렬 전 : " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);  // 피벗 왼쪽 부분 재귀 호출
            quickSort(arr, pivotIndex + 1, high); // 피벗 오른쪽 부분 재귀 호출
        }
    }

    // partition 메서드를 수정하여 arr[low]를 피벗으로 사용
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];  // 피벗을 배열의 첫 번째 요소로 설정
        int i = low;  // i를 low로 초기화

        for (int j = low + 1; j <= high; j++) {  // j는 low + 1부터 시작
            if (arr[j] <= pivot) {  // 현재 값이 피벗보다 작거나 같으면
                i++;  // i를 증가시키고
                swap(arr, i, j);  // 값을 교환
            }
        }

        // 피벗을 적절한 위치로 이동
        swap(arr, low, i);  // 피벗을 i와 교환하여 피벗을 올바른 위치에 배치

        return i;  // 피벗의 새로운 위치를 반환
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
