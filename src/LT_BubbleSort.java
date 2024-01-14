public class LT_BubbleSort {

    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean isCheck = true;
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1]){
                    isCheck = false;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if (isCheck){
                break;
            }
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
