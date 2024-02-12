public class LT_Recursion_FindMax {

    private static int curMax = -1;

    // Khong co kieu tra ve
    public static void fingMax1(int[] arr, int i){
        if (i < arr.length) {
            if (arr[i] > curMax){
                curMax = arr[i];
            }
            fingMax1(arr, i+1);
        }
    }

    // Co kieu tra ve
    public static int fingMax2(int[] arr, int i, int previousMax){
        if (i < arr.length) {
            int curMax = Math.max(previousMax, arr[i]);
            return fingMax2(arr, i+1, curMax);
        }
        return previousMax;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 12, 0};

        fingMax1(arr, 0);
        //System.out.println(curMax);
        System.out.println(fingMax2(arr, 0, Integer.MIN_VALUE));
    }
}
