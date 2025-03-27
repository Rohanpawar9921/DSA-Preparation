public class removeDuplicates {
    public static void DuplicateRemove(String str, int idx, StringBuilder newString, boolean map[]){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true){
            DuplicateRemove(str, idx+1, newString, map);
        }else{
            map[currChar - 'a'] = true;
            DuplicateRemove(str, idx+1, newString.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str = "apnacollege";
        //boolean arr[] = new boolean[26];
        DuplicateRemove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
