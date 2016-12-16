/**
 * Created by Nicholas Richardson on 12/16/2016.
 */
public class WordSearch {
    Trie trie = new Trie();
    public int search(int i) {
        switch (i) {
            case 0: return treeWords();
            case 1: return graphWords();
            case 2: return heapWords();
            case 3: return hashWords();
            case 4: return trieWords();
            case 5: return stackWords();
            case 6: return queueWords();
            case 7: return listWords();
            default: return -1;
        }

    }

    private int treeWords() {
        int count = 0;
        if (trie.search("binary")) {
            count++;
        }
        if (trie.search("search")) {
            count++;
        }
        if (trie.search("tree")) {
            count++;
        }
        if (trie.search("red")) {
            count++;
        }
        if (trie.search("black")) {
            count++;
        }
        return count;
    }
    private int graphWords() {
        int count = 0;
        if (trie.search("graph")) {
            count++;
        }
        if (trie.search("vertex")) {
            count++;
        }
        if (trie.search("edge")) {
            count++;
        }
        if (trie.search("weight")) {
            count++;
        }
        return count;
    }
    private int heapWords() {
        int count = 0;
        if (trie.search("min")) {
            count++;
        }
        if (trie.search("max")) {
            count++;
        }
        if (trie.search("heap")) {
            count++;
        }
        return count;
    }
    private int hashWords() {
        int count = 0;
        if (trie.search("key")) {
            count++;
        }
        if (trie.search("value")) {
            count++;
        }
        if (trie.search("table")) {
            count++;
        }
        if (trie.search("hash")) {
            count++;
        }
        return count;
    }
    private int trieWords() {
        int count = 0;
        if (trie.search("string")) {
            count++;
        }
        if (trie.search("suffix")) {
            count++;
        }
        if (trie.search("prefix")) {
            count++;
        }
        if (trie.search("char")) {
            count++;
        }
        return count;
    }
    private int stackWords() {
        int count = 0;
        if (trie.search("last")) {
            count++;
        }
        if (trie.search("top")) {
            count++;
        }
        if (trie.search("stack")) {
            count++;
        }
        if (trie.search("push")) {
            count++;
        }
        if (trie.search("pop")) {
            count++;
        }
        return count;
    }
    private int queueWords() {
        int count = 0;
        if (trie.search("first")) {
            count++;
        }
        if (trie.search("queue")) {
            count++;
        }
        if (trie.search("dequeue")) {
            count++;
        }
        if (trie.search("enqueue")) {
            count++;
        }
        return count;
    }
    private int listWords() {
        int count = 0;
        if (trie.search("list")) {
            count++;
        }
        if (trie.search("linked")) {
            count++;
        }
        if (trie.search("insert")) {
            count++;
        }
        return count;
    }
}
