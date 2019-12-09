package chalolabkare;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberArrayClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of array");
        int length = sc.nextInt();
        Random r= new Random();
        int[] array = new int[length];
        int i = 0;
        while (i<length){
          array[i] = r.nextInt(10*length);
         if (RandomNumberArrayClass.populatePseudoRandomElementsinArray(array))
          ++i;
         else
         {array[i]=r.nextInt(10*length);
              ++i;}
        }
        for (int i1 = 0; i1 < length; i1++) {
            System.out.print(array[i1]+"\t");
        }
    }
    public static boolean populatePseudoRandomElementsinArray(int[] array){
        for (int i = 0; i <array.length-1; i++) {
            if (array[array.length-1]==array[i])
                return false;
        }
        return true;
    }
}
