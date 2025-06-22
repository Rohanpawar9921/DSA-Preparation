public class KthLargestElementInGivenRange {
    public static void main(String[] args) {
        int l = -3;
        int r = 3;
        int k = 1;

        int result;

        if(r % 2 == 0){
            result = (r + 1) - ( k * 2);
        }
        else{
            result = (r + 2) - ( k * 2);
        }

        if(result >= l && result <= r){
            System.out.println("result is: "+result);
        }else{
            System.out.println("O");
        }
    }
}
