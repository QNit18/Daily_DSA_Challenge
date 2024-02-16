package HashTable.DesignHashMap;

import java.util.HashMap;
import java.util.Map;

public class _677_Map_Sum_Pairs {

    HashMap<String, Integer> myMap = new HashMap<>();

    public void insert(String key, int val) {
        myMap.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (Map.Entry entry : myMap.entrySet()){
            String key = entry.getKey().toString();
            if(key.startsWith(prefix)){
                sum += (int)entry.getValue();
            }
        }
        return sum;
    }
}
