package HashTable.DesignHashMap;

import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myMap.containsKey(c)){
                int value = myMap.get(c) + 1;
                myMap.put(c, value);
            }else{
                myMap.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myMap.get(c) == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
