import java.util.ArrayList;
import java.util.List;

public class _387_First_Unique_Character {
    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        int count;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i)-97]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
