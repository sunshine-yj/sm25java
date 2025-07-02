package WS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ws2 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        int max = 0;
        int min = 11;
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            if() {
                arr[i] = rand.nextInt(10) + 1;
            }
        }

        for (int i = 0; i < 5; i++) {

            System.out.println(arr[i]);

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
