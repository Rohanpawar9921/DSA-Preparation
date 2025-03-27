public class stringCompression {
    public static String compresedString(String str) {
        String compressed = "";

        for (int i = 0; i < str.length() ; i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            compressed += str.charAt(i);
            if (count > 1){
                compressed += count.toString();
            }
        }
        return compressed;
    }
    public static void main(String[] args) {
        String str = "aaabbbccc";
        System.out.println(compresedString(str));
    }
}
