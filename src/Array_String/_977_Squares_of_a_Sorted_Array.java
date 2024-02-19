package Array_String;

import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int j = 0;
        // Tim j(+) nho nhat
        while (j<n && nums[j]<0){
            j++;
        }
        int i = j-1; // i(-) lon nhat
        int[] ans = new int[n];
        int p = 0;
        while (i>=0 && j<n){
            if (nums[i]*nums[i] < nums[j]*nums[j]){
                ans[p++] = nums[i]*nums[i];
                i--;
            }else{
                ans[p++] = nums[j]*nums[j];
                j++;
            }
        }

        while (i>=0){ // Chi co i
            ans[p++] = nums[i]*nums[i];
            i--;
        }
        while (j<n){ // Chi co j
            ans[p++] = nums[j]*nums[j];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,2,9};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
