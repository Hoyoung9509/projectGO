package test;

import java.util.*;

public class aaatest {

    public static void main(String[] args) {

        for (int i = 2; i < 10; i+=3){
            for (int z = i; z <i+3 && z < 10; z++){
                System.out.print(z+"단\t\t");
            }
            System.out.println();
            for (int j = 1; j < 10; j++){
                for (int k = i; k < i+3 && k < 10; k++){
                    System.out.print(k +"x"+ j + "=" + (k*j) + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
