package test;

import java.util.*;

public class Movietest {

    public static void main(String[] args) {
        int[] arr = {5, 324, 1, 34, 4, 33, 66};

        System.out.println(Arrays.toString(arr)); // 정렬 전 배열을 출력.

        sort(arr, 0, arr.length -1); // 마지막 인덱스 번호를 알기 위해 총 길이에 1을 뺌.

        System.out.println(Arrays.toString(arr)); // 정렬 후 출력.

    }

    // 정렬할거. 파티션 함수를 돌리고 리턴 받은 피펏값의 인덱스를 받아서 다시 재귀 호출하여 모든 정렬이 끝날때까지 반복.
    public static void sort(int[] arr, int low, int high){
        if (low < high){ // 재귀 호출할거기 때문에 조건을 걸고 이 조건이 끝나면 최종적으로 함수를 탈출함.
            int pivotIndex = part(arr, low, high); // 리턴받은(part 메서드에서 리턴 : i) 피벗인덱스를 기준으로 재귀 호출 하면서 재정렬 하기 위해 리턴받은 피벗 위치.
            sort(arr, low, pivotIndex -1); // 여기가 전까지
            System.out.println("좌측 배열 완료 : "+Arrays.toString(arr));
            sort(arr, pivotIndex+1, high); // 여긴 피벗 다음 인덱스부터 마지막 인덱스까지
            System.out.println("우측 배열 완료 : "+Arrays.toString(arr));
        }

    }

    //파티션 함수 - 정렬 후 최종 피벗 인덱스 위치를 리턴해줘야함.
    public static int part(int[] arr, int low, int high){
        int pivot = arr[low]; // 피벗값을 (인덱스넘버 X) 저장. 비교하기 위함.
        int i = low; // 피벗값의 인덱스 넘버를 i에 저장. 스왑 후 i를 증가시켜주면서 마지막 스왑으로 피벗값을 고정된 위치에 넘겨줘야함.
        System.out.println("파티션 돌기 전 배열 상태 : "+Arrays.toString(arr));
        for (int j = low+1; j<= high; j++){
            if (arr[j] <= pivot){

                i++;
                swap(arr, j, i);
                System.out.println(i+"번 인덱스와 "+j+"번 인덱스를 스위칭 할거야.\n"+"스왑 후 : "+ Arrays.toString(arr));
            }
        }
        swap(arr, i, low);
        return i;
    }

    public static void swap (int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}


