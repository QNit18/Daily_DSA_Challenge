package HashTable.DesignHashSet;

import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> myset = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (myset.contains(nums[i])){
                return true;
            }else{
                myset.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
