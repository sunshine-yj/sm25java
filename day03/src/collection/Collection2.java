package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Collection2 {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("a");
//        set.add("b");
//        set.add("b");
//
//        for(String i : set){
//            System.out.println(i);
//        }

        // set을 이용하려 (1~10)까지의 6개 숫자를 Set에 입력하고 훅력하시오
        Set<Integer> set1 = new HashSet<>();
        Random random = new Random();
        int cnt = 0;
        while (set1.size() < 6){
            cnt++;
            set1.add(random.nextInt(10) + 1);
        }
        System.out.println("Count: " + cnt);
        for(Integer i : set1){
            System.out.println(i);
        }
    }
}
