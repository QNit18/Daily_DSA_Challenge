import java.util.Arrays;

public class _912_Sort_an_Array {

    public static int[] sortArray(int[] nums) {
        quickSort(nums,0, nums.length - 1);
        return nums;
    }

    static void quickSort(int[] a, int L, int R) {
        if (L >= R) return;
        //  B1 chon key
        int key = a[(L + R) / 2];
        // B2 Phân bổ lại mảng
        int pivot = partition(a, L, R, key);

        // Chia mang theo pivot
        quickSort(a, L, pivot-1);
        quickSort(a, pivot, R);

    }

    private static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while (iL<= iR){
            // Cho sang ben phai key
            while (a[iL] < key) iL++;
            // Cho sang ben trai key
            while (a[iR] > key) iR--;
            // Doi cho 2 phan tu khong dung vi tri
            if (iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++; iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
        a = sortArray(a);
        System.out.println(Arrays.toString(a));
    }

}
