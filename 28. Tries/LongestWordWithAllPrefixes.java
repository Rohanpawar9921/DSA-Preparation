public class LongestWordWithAllPrefixes {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }
     static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int level =0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;

    }

    public static String ans = "";

    static void longestWord(Node root, StringBuilder temp) {
        if (root == null) return;

        for(int i=0; i<26; i++) {
            
            if(root.children[i] != null && root.children[i].eow == true) {
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); //backtrack
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a", "app", "appl", "ap", "banana", "apply", "apple"};
        for (String word : words) {
            insert(word);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
        
    }
}
