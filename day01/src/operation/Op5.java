package operation;

public class Op5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int max;
        int min;

        max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        min = (a < b ? a : b) < c ? (a < b ? a : b) : c;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
