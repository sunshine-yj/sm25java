package operation;

public class Op3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        char c;
        if (a > b) {
            c = 'T';
        } else {
            c = 'F';
        }
        System.out.println(c);

        c = (a > b) ? 'T' : 'F';
        System.out.println(c);
    }
}
