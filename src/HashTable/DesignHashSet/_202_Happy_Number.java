package HashTable.DesignHashSet;

import java.util.HashSet;
import java.util.Set;

public class _202_Happy_Number {

    public static int nextNumber(int n){
        int num = 0;
        while (n > 0){
            num += Math.pow((n%10),2);
            n /= 10;
        }

        return num;
    }

    public static boolean isHappy(int n) {
        Set<Integer> mySet = new HashSet<>();
        while (n > 1 ){
            int nextNumber = nextNumber(n);
            if (mySet.contains(nextNumber) || n ==1){
                return false;
            }else{
                mySet.add(nextNumber);
            }
            n = nextNumber;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
