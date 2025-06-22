import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000};
        int count = 0;
        int toGive = 113;

        Arrays.sort(coins, Collections.reverseOrder());
        int i=0;
        while(i <coins.length){
            if(toGive == 0){
                break;
            }
            while(coins[i] <= toGive){
                count++;
                toGive = toGive - coins[i];
            }
            i++;
        }
        System.out.println(count);
    }
}
