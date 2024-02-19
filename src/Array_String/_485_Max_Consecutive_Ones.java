package Array_String;

public class _485_Max_Consecutive_Ones {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max1,max2; max1 = max2 =0;
        for(int num : nums) {
            if (num == 1) {
                max2++;
            } else{
                max1 = Math.max(max1, max2);
                max2 =0;
            }
        }
        return Math.max(max1, max2);
    }

    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
