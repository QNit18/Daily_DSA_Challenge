package Array_String;

public class _88_Merge_sorted_array {

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        int size = m + n - 1;
//        for (int a : nums2) {
//            insertElement(a, nums1, m,size);
//            m++;
//        }
//    }
//
//    private static void insertElement(int a, int[] nums1, int m, int size) {
//        boolean check = false;
//        for (int i = 0; i < m; i++) {
//            if (nums1[i] > a){
//                check = true;
//                for (int j=size; j>i; j--){
//                    nums1[j] = nums1[j-1];
//                }
//                nums1[i] = a;
//                break;
//            }
//        }
//        if (check == false){
//            nums1[m] = a;
//        }
//    }


    // Tow pointer
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (k >= 0){
            if (j < 0){
                nums1[k] = nums1[i--];
            }else if (i<0) {
                nums1[k] = nums2[j--];
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i--];
            }else{
                nums1[k] = nums2[j--];
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {0,4,6};

        merge(nums1, 3, nums2, 3);
        for (int a : nums1) {
            System.out.print(a + " ");
        }
    }
}
