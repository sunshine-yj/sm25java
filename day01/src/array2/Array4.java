package array2;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Random rand = new Random();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int num = rand.nextInt(10) + 1;
                if (i == 0 && j == 0) {
                    arr[i][j] = num;
                } else {
                    boolean flag = true;
                    point:
                    for (int k = 0; k <= i; k++) {
                        for (int n : arr[k]) {// arr[k]에서 원소를 하나씩 꺼내서 n에 넣는다
                            if (n == num) {// n이 num변수와 값이 같으면 실행
                                flag = false;
                                j--;
                                break point;
                            }
                        }
                    }
                    if (flag) {// flag가 참일 경우 실행
                        arr[i][j] = num;
                    }
                }

            }
        }

        for(int n[]: arr) {
            for(int num: n) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
