public class searchInSortedMartrix {

    public static boolean  stairCaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        //when finding from top-right
        while ( row <= matrix.length-1 && col >= 0) {
            if (key == matrix[row][col]){
                System.out.println("found at "+row+ ", "+col);
                //return  true;
            }
            if (key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }

        //when searching from bottom-left
        row = matrix.length-1;
        col = 0;
        
        while(row >= 0 && col < matrix[0].length){
            if (matrix[row][col] == key){
                System.out.println("found at "+row+ ", "+col);
                return true;
            }
            if (key > matrix[row][col]){
                col++;
            }
            else {
                row--;
            }
        }


        System.out.print("not found ");
        
        return  false;
    }
    public static void main(String[] args) {
        int matrix[][]= {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 500;
        stairCaseSearch(matrix, key);
    }
}
