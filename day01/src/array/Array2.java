package array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
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
