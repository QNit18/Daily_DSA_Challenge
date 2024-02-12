public class LT_Recursion {

    public static int calGiaiThua(int n){
        if (n== 0){
            return 1;
        }
        return n * calGiaiThua(n-1);
    }

    public static int Fibo(int n){
        if (n<=1){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }

    // In tu 0 -> n-1
    public static void printElement(int[] arr, int n){
        // Bai toan co so
        if (n < 0 | n >= arr.length) { // vì xét từ 0 -> n-1 nn nếu n =arr.length thì bài toán cow sở đươc tìm thấy
            return;
        }
        System.out.println(arr[n]);
        printElement(arr, n+1);
    }

    // In tu n-1 -> 0
    public static void printElement2(int[] arr, int n){
        // Bai toan co so
        if (n < 0) {
            return;
        }
        System.out.println(arr[n]);
        printElement2(arr, n-1);
    }

    // De quy co nho
    static int[] F = new int[1000];
    public static int Fibo2(int n){
        if (F[n] != 0){
            return F[n];
        }
        System.out.println("Can tinh F["+n+"]");
        if (n <= 2){
            F[1] = 1;
            F[2] = 1;
            return 1;
        }

        F[n] = Fibo2(n-1) + Fibo2(n-2);
        return F[n];
    }

    public static void main(String[] args) {

        //System.out.println(calGiaiThua(5));
       // System.out.println(Fibo(2));
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        //printElement(arr, 0);
        //printElement2(arr, 9);
        System.out.println(Fibo2(10));

    }
}
