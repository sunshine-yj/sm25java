package collection;

import java.util.HashMap;
import java.util.Map;

public class Collection3 {
    public static void main(String[] args) {
        //Map (Key, Value)
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        for(String s : map.keySet()){
            System.out.println(s);
        }
        for(Integer i : map.values()){
            System.out.println(i);
        }
    }
}
