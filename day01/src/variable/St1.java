package variable;

public class St1 {
    public static void main(String[] args) {
        // Refrtence Type ... Primitive Type x
        // Refrtence Type => Class Oject

        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = "abc";
        if (str1 == str2) {
            System.out.println("OK1");
        }
        if (str1 == str3) {
            System.out.println("OK2");
        }
        if (str3 == str4) {
            System.out.println("OK3");
        }
        if (str1.equals(str2)) {
            System.out.println("OK4");
        }
        if (str1.equals(str3)) {
            System.out.println("OK5");
        }
        if (str1.equals(str4)) {
            System.out.println("OK6");
        }
    }

}
