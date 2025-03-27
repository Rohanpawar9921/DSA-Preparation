public class searcnin2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int start =0;
        int end = n-1;
        int mid;

        while(start <= end) {
            mid = start + (end - start)/2;

            if (matrix[mid][0] <= target && target <= matrix[mid][m - 1]){
                start = mid;
                break;
            }
            if(target > matrix[mid][0]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        if (start < 0 || start >= n) {
            return  false;
        }

        System.out.println(start + " " +end);

        end = m-1;
        int row = start;
        start = 0;

        System.out.println(start + " " +end);

        while(start <= end) {
            mid = start + (end - start)/2;

            if (matrix[row][mid] == target){
                return true;
            }
            if(target > matrix[row][mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[][] matrix= {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target = 3;
        boolean result = searchMatrix(matrix, target);
        System.out.println(result);
        
    }
}
