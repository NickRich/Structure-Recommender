/**
 * Created by Nicholas Richardson on 12/16/2016.
 */
public class DataStructureInfo {
    public void getInfo(String structure) {
        System.out.println(structure);
        switch (structure) {
            case "Tree":
                System.out.println("Access: O(log(n))");
                System.out.println("Search: O(log(n))");
                System.out.println("Insertion: O(log(n))");
                System.out.println("Deletion: O(log(n))");
                break;
            case "Graph":
                System.out.println("Adjacency List:");
                System.out.println("Access: O()");
                System.out.println("Search: O()");
                System.out.println("Insertion: O()");
                System.out.println("Deletion: O()");
                System.out.println("Adjacency Matrix:");
                System.out.println("Access: O()");
                System.out.println("Search: O()");
                System.out.println("Insertion: O()");
                System.out.println("Deletion: O()");
                break;
            case "Heap":
                System.out.println("Access: O()");
                System.out.println("Search: O()");
                System.out.println("Insertion: O()");
                System.out.println("Deletion: O()");
                break;
            case "Hash Table":
                System.out.println("Access: O()");
                System.out.println("Search: O(1)");
                System.out.println("Insertion: O(1)");
                System.out.println("Deletion: O(1)");
                break;
            case "Trie":
                System.out.println("Access: O(log(n))");
                System.out.println("Search: O(log(n))");
                System.out.println("Insertion: O(log(n))");
                System.out.println("Deletion: O(log(n))");
                break;
            case "Stack":
                System.out.println("Access: O(n)");
                System.out.println("Search: O(n)");
                System.out.println("Insertion: O(1)");
                System.out.println("Deletion: O(1)");
                break;
            case "Queue":
                System.out.println("Access: O(n)");
                System.out.println("Search: O(n)");
                System.out.println("Insertion: O(1)");
                System.out.println("Deletion: O(1)");
                break;
            case "Linked List":
                System.out.println("Access: O(n)");
                System.out.println("Search: O(n)");
                System.out.println("Insertion: O(1)");
                System.out.println("Deletion: O(1)");
                break;
            case "Array/Matrix":
                System.out.println("Array:");
                System.out.println("Access: O(1)");
                System.out.println("Search: O(n)");
                System.out.println("Insertion: O(n)");
                System.out.println("Deletion: O(n)");
                System.out.println("Matrix:");
                System.out.println("Access: O(1)");
                System.out.println("Search: O(n^2)");
                System.out.println("Insertion: O(n^2)");
                System.out.println("Deletion: O(n^2)");
                break;
        }
    }
}
