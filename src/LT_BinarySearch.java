import java.util.Arrays;

public class LT_BinarySearch {

    // Dùng mảng
//    public static int  binarySearch(int[] a, int key) {
//        int iLeft = 0;
//        int iRight = a.length-1;
//
//        while (iLeft <= iRight) {
//            int iMid = (iLeft + iRight) /2;
//            if (key == a[iMid]){
//                return iMid;
//            } else if (key > a[iMid]){
//                iLeft = iMid + 1;
//            }else {
//                iRight = iMid -1;
//            }
//        }
//        return -1;
//    }


    // Đệ quy
    public static int bSearch(int[] a, int key, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return -1;
        }
        int iMid = (iLeft + iRight) / 2;
        if (key == a[iMid]) {
            return iMid;
        } else if (key > a[iMid]) {
            return bSearch(a, key, iMid + 1, iRight);
        } else {
            return bSearch(a, key, iLeft, iMid - 1);
        }

    }

    public static int binarySearch(int[] a, int key) {
        return bSearch(a, key, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 9, 12, 19, 25, 31, 46, 50, 57, 72};
        System.out.print(binarySearch(a, 31));
    }
}
