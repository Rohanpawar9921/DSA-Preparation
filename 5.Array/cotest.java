public class cotest {
    public static int maxActiveSectionsAfterTrade(String s) {
        
        int currZero = 0;
        int maxZero = Integer.MIN_VALUE;
        int n = s.length();
        int a, b;
        int oneCount = 0;

        
        if(n <= 2){
            for(int i=0; i < n; i++){
                if(s.charAt(i) == '1'){
                    oneCount++;
                }
            }
            return oneCount;
        }
        
        for (int i=0; i< n; i++){
            if(s.charAt(i) == '1'){
                oneCount++;
                a = i - 1;
                b = i + 1;
                while(s.charAt(a) == '0' && a >= 0){
                    a--;
                    currZero++;
                }
                while(s.charAt(b) == '0' && b < n){
                    b++;
                    currZero++;
                }
                if(maxZero < currZero) {
                    maxZero = currZero;
                }
                currZero = 0;
            }
        }
        return maxZero + oneCount;
    }
    public static void main(String[] args) {
        String s = "0100";
        System.out.println(maxActiveSectionsAfterTrade(s));
    }
}
