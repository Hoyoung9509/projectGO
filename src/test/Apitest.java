package test;

import mainsrc.IntArray;

import java.util.Arrays;

public class Apitest {

    public static void main(String[] args) {
        for (int group = 0; group < 3; group++) {         // 3개의 그룹
            for (int index = 0; index < 3; index++) {       // 각 그룹마다 3개의 숫자
                int term = 11 + group * 30 + index * 11;
                System.out.println(term);
            }
        }
    }
}
