package mainsrc;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {


        IntArray list = new IntArray();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);


//        System.out.println(list.get(1));

        for( int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
