public class KadanesAlgoForMaxSubarraySum {
    public static void main(String[] args) {
        int numbers[] = {-2, -3, -4, -1, -2, -1, -5, -3};
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length ; i++ ) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        if (ms == 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0 ; i < numbers.length ; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("Our max sumarray is : " + max);
        }else {
            System.out.println("Our max sumarray is : " + ms);
        }
        
    }
}
