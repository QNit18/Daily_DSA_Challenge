public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {

    // Duyet xuoi
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max;
        for (int i = 0; i < n; i++) {
            if (i == n-1){
                arr[i] = -1;
                return arr;
            }else {
                max = arr[i+1];
                for (int j = i+1; j < n; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
            }
            arr[i] = max;
        }
        return arr;
    }

    // Duyet nguoc
    public static int[] replaceElements2(int[] arr) {
        int n = arr.length;
        int temp = -1; // biến lữu giá trị của biến trước đó
        int max = -1;
        for (int i = n-1; i >=0 ; i--) {
            if (temp > max) {
                max = temp;
            }
            temp = arr[i];
            arr[i] = max;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        arr = replaceElements2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
