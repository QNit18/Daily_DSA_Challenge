package HashTable.DesignHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,1,3,3,3,2};
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i : arr){
            if (!myMap.containsKey(i)){
                myMap.put(i, 1);
            }else {
                int value = myMap.get(i) + 1;
                myMap.put(i, value);
            }
        }

        for (Map.Entry entry : myMap.entrySet()){
            System.out.println(entry.getKey() + " Xuat hien : " + entry.getValue() + " lan.");
        }
    }
}
