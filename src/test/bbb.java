package test;

import java.util.*;

public class bbb {
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };

        int[][] result = new int [score.length +1][score[0].length+1];

        for (int i = 0; i < score.length; i++){
            for (int j = 0; j < score[i].length; j ++){
                int sum = 0;
                sum += score[i][j];
                result[i][3] = sum;


            }

        }

        for (int i = 0; i < result.length; i ++){
            for (int j = 0; j < result[i].length; j ++){
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}