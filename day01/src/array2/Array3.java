package array2;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // 1~100까지의 random 한 숫자를 입력한다.
        // 단, 중복 되서 들어가면 안된다.
        // 최종 배열을 출력
        int [][] arr = new int [5][5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num = rand.nextInt(100) + 1;
                if (i == 0 & j == 0)
                    arr[i][j] = num;
                else {
                    for (int k = 0; k < 5; k++) {
                        for (int l = 0; l < 5; l++) {
                            if (arr[k][l] == num) {
                                j--;
                            }
                            else {
                                arr[i][j] = num;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%02d ", arr[i][j]);
            }
            System.out.println();
        }

    }
}
