package mainsrc;

import test.*;
import java.util.*;
public class main {


    public static void main(String[] args) {

        int[] arr = {55,44,3,21,2};

        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);

        System.out.println("min 값 : "+ min);
        System.out.println("max 값 : "+ max);

    }
}
