public class trappingRainwater {
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int n = height.length;
        int LMB[] = new int[n];
        int RMB[] = new int[n];

        //RMB
        RMB[n-1] =height[n-1];
        for(int i = n-2; i>=0 ; i--) {
            RMB[i] = Math.max(height[i] , RMB[i+1]);
        }
        // System.out.print("RMB = ");
        // for (int i = 0 ; i < n ; i++) {
        //     System.out.print(RMB[i] + " ");
        // }
        //System.out.println();

        //LMB
        LMB[0] = height[0];
        for (int i = 1; i < n ; i++) {
            LMB[i] = Math.max(height[i], LMB[i-1]);
        }
        // System.out.print("LMB = ");
        // for (int i = 0 ; i < n ; i++) {
        //     System.out.print(LMB[i] + " ");
        // }

        // System.out.println();

        //water
        int totalWater = 0;
        for (int i = 0; i < n ; i++) {
            totalWater = totalWater + (Math.min(RMB[i], LMB[i]) - height[i]);
        }
        System.out.println("Total water is : "+ totalWater);

    }
}
