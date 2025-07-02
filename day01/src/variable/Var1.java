package variable;

public class Var1 {
    public static  void main (String args[]) {

        int intNum = 10; // 32bit 4byte
        long longNum = 10L; // 64bit 8byte

        byte b1 = 100;
        byte b2 = 100;
        int b3 = b1 + b2;
        byte b4 = (byte) (b1 + b2);

        System.out.println(b3);

        // 실수 double
        float f1 = 10.0F; //32bit 4byte
        float f2 = 10.0F;
        float f3 = f1 + f2;

        System.out.println(f3);

        double d1 = 10D; // 64bit 8byte

        int num1 = 1500000000;
        int num2 = 1500000000;
        //int result = num1 + num2;
        int result = num1 + num2;
        System.out.println(result);
    }
}
