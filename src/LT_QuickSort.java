import java.util.Arrays;

public class LT_QuickSort {

    private static void quickSort(int[] a, int L, int R) {
        if (L < R) {
            // Phan bo lai mang va tim pivot
            int pivotIndex = partition(a, L, R);

            // De quy de sap xep cac phan tu truoc va sau pivot
            quickSort(a, L, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, R);
        }
    }

    // return pivot
    static int partition(int[] a, int L, int R){

        // Chon pivot la phan tu cuoi cung
        int pivot =  a[R];
        int i = L - 1; // Theo doi

        // Di chuyen cac phan tu < pivot ve dau mang
        for (int j = L; j < R; j++) {
            if(a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }

        // Dat pivot vao dung vi tri
        swap(a, i+1, R);

        return i+1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] =temp;
    }

    public static void main(String[] args) {
        int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
        quickSort(a, 0, a.length -1);
        System.out.println(Arrays.toString(a));
    }

}
