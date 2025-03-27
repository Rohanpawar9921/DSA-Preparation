public class buyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        int buyP = Integer.MAX_VALUE;
        int maxPro = 0;
        int profit;
        
        for (int i = 0 ; i < n ; i++) {
            if (buyP < prices[i]) {
                profit = prices[i] - buyP;
                if ( maxPro < profit) {
                    maxPro = profit;
                }
            }
            else {
                buyP = prices[i];
            }
        }

        System.out.println("Maximun profit that can be achieved is : "+maxPro);

    }
}
