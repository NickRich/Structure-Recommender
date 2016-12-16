import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nicholas Richardson on 12/16/2016.
 */

public class Trie {
    private Node root;
    public Trie() {
        root = new Node();
    }
    public void Insert(String word) {
        HashMap<Character, Node> children = root.children;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            Node n;
            if (children.containsKey(c)) {
                n = children.get(c);
            } else {
                n = new Node(c);
                children.put(c, n);
            }
            children = n.children;

            if (i == word.length() - 1) {
                n.isLeaf = true;
            }
        }
    }
    public boolean search(String word) {
        Node n = searchNode(word);
        if (n != null && n.isLeaf) {
            return true;
        }
        return false;
    }

    private Node searchNode(String word) {
        Map<Character, Node> children = root.children;
        Node n = null;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (children.containsKey(c)) {
                n = children.get(c);
                children = n.children;
            } else {
                return null;
            }
        }
        return n;
    }
}
