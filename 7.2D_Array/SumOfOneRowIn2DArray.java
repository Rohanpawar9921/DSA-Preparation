public class SumOfOneRowIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };
        int sum = 0;
        
        for (int j=0 ; j< arr[0].length ; j++) {
            sum += arr[1][j];
        }
        System.out.print(sum);
    }
}
