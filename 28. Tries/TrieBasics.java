public class TrieBasics {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

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
    public static boolean search(String key) {
        Node curr = root;
        for(int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static void main(String[] args) {
        String words[] = {"there", "a", "there", "their", "any", "thee"};
        for (String word : words) {
            insert(word);
        }
        // System.out.println(args[0]); //just for checking, 

                                            //you should read the process of execution of java

                                            // read - 1. https://chatgpt.com/share/682988f5-8560-800b-bf9e-e8d9057fb3bb

                                            // read - 2. https://www.geeksforgeeks.org/java-main-method-public-static-void-main-string-args/

        System.out.println(search("thee"));
        System.out.println(search("thor"));

    }
}