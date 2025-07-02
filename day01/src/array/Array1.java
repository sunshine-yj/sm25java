package array;

import java.util.Random;

public class Array1 {
    public  static void main(String args[]) {
        // Reference Type...
        int [] arr1 = new int[5];
        int arr2 [] = new int[5];
        int [] arr3 = {1,2,3,4,5};

//        for (int i = 0; i < 5; i++) {
//            arr1[i] += i;
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr1[i] + " ");
//        }

        System.out.println();
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            arr2[i] = rand.nextInt(10);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }

        for (int n:arr2) {
            System.out.print(n + " ");
        }

    }
}
