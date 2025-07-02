package variable;

public class St2 {
    public static void main(String[] args) {
        // Class API
        String str = "youjin200378@gmail.com";
        String upperStr = str.toUpperCase();
        System.out.println(upperStr);// String 값은 String pool 안에 한번 생성하면 변정할 수 없음
        String newStr= str.substring(1,3);
        System.out.println(newStr);
    }
}
