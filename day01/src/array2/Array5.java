package array2;

import java.util.Random;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        // 배열 선언
        int arr[][] = new int[3][3];
        Random rand = new Random();
        // 배열에 값을 입력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = rand.nextInt(10) + 1;
                if (i == 0 && j == 0) {
                    arr[i][j] = num;
                } else {
                    boolean flag = true;
                    point:
                    // num이 배열에 있으면 다시 랜덤변수 생성
                    for (int k = 0; k <= i; k++) {
                        for(int n : arr[k]) {
                            if (n == num) {
                                flag = false;
                                j--;
                                break point;
                            }
                        }
                    }
                    // num이 배열에 없으면 입력
                    if (flag == true) {
                        arr[i][j] = num;
                    }
                }
            }
        }
        // 배열 출력
        for (int a[] : arr) {
            for (int n : a) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
