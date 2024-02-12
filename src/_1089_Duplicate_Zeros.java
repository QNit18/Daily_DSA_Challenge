public class _1089_Duplicate_Zeros {

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                for (int j = n-1; j >i ; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
