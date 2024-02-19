package Array_String;

public class _1295_Find_Numbers_with {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums) {
            if((int)(Math.log10(a) + 1) % 2 ==0){
                count++;
            }
        }
        return count;
    }

    private static int cala(int a) {
        int length = 0;
        while(a>0){
            a/= 10;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,534,5,4536,1234453,543,1231235,435,567567243,23453213,435348,2342334};
        System.out.println(findNumbers(arr));
    }
}
