package control;

public class Control2 {
    public static void main(String[] args) {
        // 1~10까지의 합과 평균을
        // for 문을 이용하여 구하시오

        int sum = 0;
        double avg = 0.0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            count++;
        }
        avg = sum / (double)count;
        System.out.printf("합계 : %d, 평균 : %.1f", sum, avg);
    }
}
