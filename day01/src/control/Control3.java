package control;

public class Control3 {
    public static void main(String[] args) {
        // 1~10까지의 합과 평균을
        // while 문을 이용하여 구하시오

        int sum = 0;
        double avg = 0.0;
        int count = 1;
        while (count <= 10) {
            sum += count;
            count++;
        }
        avg = Double.valueOf(sum) / (count-1);
        System.out.println(sum);
        System.out.println(avg);
    }
}
