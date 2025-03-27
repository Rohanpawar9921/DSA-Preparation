public class findSubsets {
    public static void subsets(String str, String ans, int i){
        //base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        //kam
        //case 1 - yes
        subsets(str, ans + str.charAt(i), i+1);

        //case 2 - no
        subsets(str, ans, i+1);
    }
    
    
    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "", 0);
    }
}