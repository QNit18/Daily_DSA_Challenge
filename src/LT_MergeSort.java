import java.util.Arrays;

public class LT_MergeSort {

    public static int[] merge(int[] a1, int[] a2){
        // Trộn lại sau khi chia xong
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i=0, i1=0, i2=0;
        while (i < n) {
            if (i1 < a1.length && i2<a2.length){ // a1 va a2 != null
                if (a1[i1] <= a2[i2]){ // a2 >= a1
                    result[i++] = a1[i1++];
                }else{ // a2 < a1
                    result[i++] = a2[i2++];
                }
            }else{
                if(i1 < a1.length){
                    result[i++] = a1[i1++];
                }else{
                    result[i++] = a2[i2++];
                }
            }
        }
        return result;
    }

    public static int[] mergeSort(int a[], int L, int R) {
        // TH Đặc biệt : TH Cơ sở
        if (L > R) return new int[0];
        if (L==R) {
            return new int[]{a[L]};
        }

        // Chia ra
        //System.out.println("Chia: " + L + " - " + R);
        int k = (L+R)/2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k+1, R);

        return merge(a1, a2);
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {5,2,3,1};
        arr = sortArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
