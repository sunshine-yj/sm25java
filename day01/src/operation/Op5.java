package operation;

public class Op5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int max = 0;
        int min = 0;

        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
