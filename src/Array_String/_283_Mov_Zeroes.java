package Array_String;

public class _283_Mov_Zeroes {

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for (int a : arr){
            System.out.print(a+ " ");
        }
    }
}
