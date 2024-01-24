import java.util.Arrays;

public class _1051_Height_Checker {

    public static int heightChecker(int[] heights) {
        int n = heights.length;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = heights[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,1,4,2,1,3};
        System.out.println(heightChecker(array));
    }
}
