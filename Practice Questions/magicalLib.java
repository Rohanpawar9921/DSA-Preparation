public class magicalLib {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = 0;
        for(int i=0; i<3; i++) {
            int currSum = 0;
            for(int j=0; j<3; j++) {
                if(arr[i][j] % 2 != 0) {
                    currSum += arr[i][j];
                }
            }
            if (currSum % 2 == 0) {
                result++;
            }
        }
        System.out.println(result);


    }
}
