package Array_String;

public class _27_Remove_Element {
//    public static int removeElement(int[] nums, int val) {
//        int size = nums.length;
//        int count = 0;
//        for (int i = 0; i < size;) {
//            if (nums[i] == val){
//                for (int j = i; j < size - 1; j++) {
//                    nums[j] = nums[j+1];
//                }
//                count++;
//                size--;
//            }else{
//                i++;
//            }
//        }
//        return size;
//    }

    // Two pointer
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }
}
