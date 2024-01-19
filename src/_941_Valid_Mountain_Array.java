public class _941_Valid_Mountain_Array {

    public static boolean validMountainArray(int[] arr) {
        boolean check = false;
        int n = arr.length;
        if (n<=2 || arr[0] > arr[1]){
            return false;
        }
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1] && check==false){
                check = true;
            } else if ((arr[i] < arr[i+1] && check==true) || (arr[i]==arr[i+1]) ){
                return false;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1};
        System.out.println(validMountainArray(arr));
    }
}
