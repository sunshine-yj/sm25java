package control;

import java.util.Random;
import java.util.Scanner;

public class Control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("Enter Command : (arr1, arr2, arr3) : ");
            String cmd = sc.nextLine();
            System.out.println("> " + cmd);
            if (cmd.equals("q")) {
                System.out.println("Quit...");
                break;

            } else if (cmd.equals("arr1")) {
                System.out.print("Enter Number1 (1~10): ");
                String num1 = sc.nextLine();
                System.out.print("Enter Number2 (1~10): ");
                String num2 = sc.nextLine();
                System.out.printf("Input Number %s, %s\n", num1, num2);
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                System.out.printf("Add : %d\n", n1 + n2);

            } else if (cmd.equals("arr2")) {

                System.out.print("Enter Size : ");
                String size = sc.nextLine();
                int size1 = Integer.parseInt(size);
                int [] arr2 = new int[size1];

                Random rand = new Random();
                for (int i = 0; i < size1; i++) {
                    int num = rand.nextInt(10) + 1;
                    if (i == 0)
                        arr2[i] = num;
                    else {
                        for (int j = 0; j < i; j++) {
                            if (arr2[j] == num) {
                                i--;
                                break;
                            } else {
                                arr2[i] = num;
                            }
                        }
                    }
                }
                // 1번 조건
                for(int i = 0; i < arr2.length; i++) {
                    System.out.printf("%2d ", arr2[i]);
                }
                System.out.println();
                // 2번 조건
                int sum1 = 0;
                double avg1 = 0.0;
                for (int n: arr2) {
                    sum1 += n;
                }
                avg1 = sum1*1.0 / arr2.length;
                System.out.printf("Sum : %d, Avg : %.1f\n", sum1, avg1);
                //3번 조건
                int max1 = 0;
                int min1 = 11;
                for (int i = 0; i < arr2.length; i++) {
                    if (arr2[i] > max1) {
                        max1 = arr2[i];
                    }
                    if (arr2[i] < min1) {
                        min1 = arr2[i];
                    }
                }
                System.out.printf("Max : %d, Min : %d\n", max1, min1);

            } else if (cmd.equals("arr3")) {

                System.out.print("Enter Size1 : ");
                String size2 = sc.nextLine();
                System.out.print("Enter Size2 : ");
                String size3 = sc.nextLine();
                int size4 = Integer.parseInt(size2);
                int size5 = Integer.parseInt(size3);
                int [][] arr3 = new int[size4][size5];

                Random rand = new Random();
                for (int i = 0; i < arr3.length; i++) {
                    for (int j = 0; j < arr3[i].length; j++) {
                        int num1 = rand.nextInt(30) + 1;
                        if (i == 0 && j == 0) {
                            arr3[i][j] = num1;
                        } else {
                            boolean flag = true;
                            point:
                            for (int k = 0; k <= i; k++) {
                                for (int n : arr3[k]) {
                                    if (n == num1) {
                                        flag = false;
                                        j--;
                                        break point;
                                    }
                                }
                            }
                            if (flag) {
                                arr3[i][j] = num1;
                            }
                        }
                    }
                }

                // 1번 조건
                for (int i = 0; i < arr3.length; i++) {
                    for (int j = 0; j < arr3[i].length; j++) {
                        System.out.printf("%2d ", arr3[i][j]);
                    }
                    System.out.println();
                }
                // 2번 조건
                int sum2 = 0;
                int count = 0;
                double avg2 = 0.0;
                for (int i = 0; i < arr3.length; i++) {
                    for (int n: arr3[i]) {
                        sum2 += n;
                        count++;
                    }
                }
                avg2 = sum2*1.0 / count;
//                System.out.println(count);
                System.out.printf("Sum : %d, Avg : %.1f\n", sum2, avg2);
                // 3번 조건
                int max2 = 0;
                int min2 = 31;
                for (int i = 0; i < arr3.length; i++) {
                    for (int n: arr3[i]) {
                        if (max2 < n) {
                            max2 = n;
                        }
                    }
                    for (int n: arr3[i]) {
                        if (min2 > n) {
                            min2 = n;
                        }
                    }
                }
                System.out.printf("Max : %d, Min : %d\n", max2, min2);
            } else {
                System.out.println("Invalid Command...");
            }
        }
        sc.close();
    }
}
