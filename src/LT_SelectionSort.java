public class LT_SelectionSort {

    public static void selectionSort(int[] a) {
        int n = a.length;
        int minIndex;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if ( a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(a[j] + " ");
//            }
//            System.out.println();
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;

        }
    }



    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
