package collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("a");
        list.remove("a");

        System.out.println(list);
//        for (Object obj : list) {
//            System.out.println(obj);
//        }

        for (String str : list) {
            System.out.println(str);
        }

        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        for (Integer i : list1) {
            System.out.println(i);
        }
    }
}
