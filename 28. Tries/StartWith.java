public class StartWith {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for(int i=0; i<children.length; i++) {
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

    public static boolean startwith(String key) {
        Node curr = root;
        for(int i=0; i<key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        for(String word: words) {
            insert(word);
        }

        System.out.println(startwith("app"));
        System.out.println(startwith("moon"));
    }
}
