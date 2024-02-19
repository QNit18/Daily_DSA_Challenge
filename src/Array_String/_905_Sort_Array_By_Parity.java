package Array_String;

public class _905_Sort_Array_By_Parity {


    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index++] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {0};
        arr = sortArrayByParity(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] +" ");
        }
    }
}
