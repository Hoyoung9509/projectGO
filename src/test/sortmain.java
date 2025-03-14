package test;

import java.util.Random;

public class sortmain {

    public static void main(String[] args) {
        // QuickSortBinarySearch 클래스의 객체를 생성
        sortmain obj = new sortmain();

        // 객체를 통해 generateRandomNumbers 호출
        int[] arr = obj.generateRandomNumbers(10);

        // 배열 출력 (정렬 전)
        System.out.println("정렬 전 배열:");
        printArray(arr);

        // 퀵정렬
        quickSort(arr, 0, arr.length - 1);

        // 배열 출력 (정렬 후)
        System.out.println("\n정렬 후 배열:");
        printArray(arr);

        // 이분탐색으로 숫자 찾기
        int target = 25;  // 찾고자 하는 숫자 (예시)
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("\n숫자 " + target + "는 배열에 존재하지 않습니다.");
        } else {
            System.out.println("\n숫자 " + target + "는 배열의 " + result + "번째 인덱스에 있습니다.");
        }
    }

    // 랜덤한 숫자 배열 생성 (인스턴스 메서드로 변경)
    public int[] generateRandomNumbers(int size) {
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);  // 0부터 99까지의 랜덤 숫자
        }

        return arr;
    }

    // 배열 출력
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 퀵정렬
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 파티션 인덱스를 얻은 후
            int pi = partition(arr, low, high);

            // 피벗을 기준으로 왼쪽과 오른쪽 부분을 재귀적으로 정렬
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // 퀵정렬을 위한 파티션 함수
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // arr[i]와 arr[j]를 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 피벗과 arr[i+1]을 교환
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // 이분탐색
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // 찾은 경우
            if (arr[mid] == target) {
                return mid;
            }

            // 왼쪽 부분 탐색
            if (arr[mid] > target) {
                high = mid - 1;
            }
            // 오른쪽 부분 탐색
            else {
                low = mid + 1;
            }
        }

        // 찾지 못한 경우
        return -1;
    }
}

