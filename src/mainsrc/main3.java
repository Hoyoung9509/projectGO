package mainsrc;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main3 {

    public static void main(String[] args) {
         main3 test = new main3();
         int[] b = test.hub(10);

         for (int num : b){
             System.out.print(num + "\t");
         }
   }

   public int[] hub(int a){
        Random rand = new Random();
        int[] arr = new int[a];

        for (int i=0; i<a; i++){
            arr[i] = rand.nextInt(100);
        }
        return arr;
   }
}
