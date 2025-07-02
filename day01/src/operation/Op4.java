package operation;

public class Op4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int max = 0;
        int min = 0;

        if (a > b && a > c) {
            max = a;
            if (b > c) {
                min = c;
            } else  {
                min = b;
            }
        } else if (b > a && b > c) {
            max = b;
            if (a > c) {
                min = c;
            } else  {
                min = a;
            }
        } else  {
            max = c;
            if (a > b) {
                min = b;
            } else  {
                min = a;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
