package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tasd {

    public static void main(String[] args) {
        int[] a = {123, 345, 546, 67, 345};
        List<Integer> list = new ArrayList<>();

        System.out.println(Arrays.toString(a));

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.toString());
    }
}
