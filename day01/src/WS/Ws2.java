package WS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ws2 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Random rand = new Random();

        for(int i=0;i<5;i++) {
            int num = rand.nextInt(10) +1;
            arr[i] = num;
            if(i == 0)
                arr[i] = num;
            else {
                for (int j=0; j<i; j++) {
                    if (arr[j] == num) {
                        i--;
                        break;
                    } else {
                        arr[i] = num;
                    }
                }
            }
        }

//        for (int i = 0; i < 5; i++) {
//            arr[i] = rand.nextInt(10) + 1;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    i--;
//                }
//            }
//        }

        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i] + " ");
//        }

        int max = arr[0];
        int min = arr[0];

        for(int num:arr) {
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }

        System.out.printf("%d, %d", min, max);


//        int max = 0;
//        int min = 11;
//
//        for (int i = 0; i < 5; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println();
//        System.out.println("max : " + max);
//        System.out.println("min : " + min);
    }
}
