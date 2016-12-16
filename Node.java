import java.util.HashMap;

/**
 * Created by Nicholas Richardson on 12/16/2016.
 */
public class Node {
    char c;
    HashMap<Character, Node> children = new HashMap<Character, Node>();
    boolean isLeaf;

    public Node() {}

    public Node(char c) {
        this.c = c;
    }
}
