package HashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class HaspMethods {
    public static void main(String[] args){
        HashMap<String, Integer> mp= new HashMap<>();
        mp.put("Rome", 11);
        mp.put("Rahul", 16);
        mp.put("Ram", 19);
        mp.put("Sam", 20);
        mp.put("Sohan", 18);
        System.out.println(mp.get("Rahul"));
        System.out.println(mp.get("A"));
        mp.put("Ram", 22);
        mp.remove("Sam");
        System.out.println(mp);

        for(String key: mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }

        System.out.println();

        for(Map.Entry<String, Integer> e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

        System.out.println();

        for (var e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());

        }
    }
}
