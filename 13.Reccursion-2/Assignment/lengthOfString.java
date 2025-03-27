public class lengthOfString {
    public static void findLength(String str, int i, int l){
        if (i == str.length()){
            System.out.println(l);
            return;
        }
        //kam

        findLength(str, i+1, ++l);
    }
    public static void main(String[] args) {
        String str = "rohan";
        findLength(str, 0, 0);
    }
}
