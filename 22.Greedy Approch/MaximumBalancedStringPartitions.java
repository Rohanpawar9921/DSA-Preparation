public class MaximumBalancedStringPartitions {
    public static void main(String[] args) {
        String input = "LRRRRLLRLLRL" ;
        int r = 0;
        int l = 0;
        if (input.length() == 0){
            System.out.println("WRONG N");
        }

        int result = 0;

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == 'R'){
                r++;
            }else{
                l++;
            }

            if(r == l){
                result++;
            }
        }

        System.out.println("result is : "+ result);
    }
}
