package WS;

import java.util.Scanner;

public class Ws1 {
    public static void main(String[] args) {
        // 3번 문자를 입력 받아 배열을 출력하시오
        Scanner sc = new Scanner(System.in);
        String[] str1 = new String[3];
        for (int i = 0; i < 3; i++) {
            str1[i] = sc.next();
        }
        for (String n:str1) {
            System.out.print(n + " ");
        }
        sc.close();
    }
}
