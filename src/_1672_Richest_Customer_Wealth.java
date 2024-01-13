public class _1672_Richest_Customer_Wealth {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int r = accounts.length;
        int l = accounts[0].length;
        for (int i = 0; i < r; i++) {
            int total = 0;
            for (int j = 0; j < l; j++) {
                total += accounts[i][j];
            }
            if (total > maxWealth){
                maxWealth = total;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));

    }
}
