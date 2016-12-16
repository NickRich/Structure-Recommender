import java.util.Scanner;

/**
 * Created by Nicholas Richardson on 12/16/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfStructures = 8;
        WordSearch ws = new WordSearch();

        System.out.println("Please Enter Description of Project: ");
        String input = s.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            ws.trie.Insert(words[i]);
        }

        int[] dataStructureCount = new int[numberOfStructures];
        String[] dataStructures = new String[numberOfStructures];

        dataStructures[0] = "Tree";
        dataStructures[1] = "Graph";
        dataStructures[2] = "Heap";
        dataStructures[3] = "Hash Table";
        dataStructures[4] = "Trie";
        dataStructures[5] = "Stack";
        dataStructures[6] = "Queue";
        dataStructures[7] = "Linked List";



        for (int i = 0; i < dataStructures.length; i++) {
            int wordsFound = ws.search(i);
            if (wordsFound == -1) {
                System.out.println("Exceeded Number of Data Structures");
                break;
            }
            dataStructureCount[i] = ws.search(i);
        }

        for (int i = 0; i < dataStructureCount.length; i++) {
            for (int j = 0; j < dataStructureCount.length - 1; j++) {
                if (dataStructureCount[j] > dataStructureCount[j + 1]) {
                    int tempInt = dataStructureCount[j];
                    String tempString = dataStructures[j];
                    dataStructureCount[j] = dataStructureCount[j + 1];
                    dataStructures[j] = dataStructures[j + 1];
                    dataStructureCount[j + 1] = tempInt;
                    dataStructures[j + 1] = tempString;
                }
            }
        }
        for (int i = 0 ; i < dataStructureCount.length; i++) {
            System.out.println(dataStructureCount[i]);
        }

        DataStructureInfo DSI = new DataStructureInfo();
        if (dataStructureCount[dataStructureCount.length - 1] != 0) {
            System.out.println(dataStructures[dataStructureCount.length - 1]);
            DSI.getInfo(dataStructures[dataStructureCount.length - 1]);
        } else {
            System.out.println("Not enough info");
        }
        if (dataStructureCount[dataStructureCount.length - 2] != 0) {
            System.out.println(dataStructures[dataStructureCount.length - 2]);
            DSI.getInfo(dataStructures[dataStructureCount.length - 2]);
        } else {
            System.out.println("Not enough info");
        }
        if (dataStructureCount[dataStructureCount.length - 3] != 0) {
            System.out.println(dataStructures[dataStructureCount.length - 3]);
            DSI.getInfo(dataStructures[dataStructureCount.length - 3]);
        } else {
            System.out.println("Not enough info");
        }

//        if (firstRecommended != -1) {
//            System.out.println(dataStructures[firstRecommended]);
//            DSI.getInfo(dataStructures[firstRecommended]);
//        } else {
//            System.out.println("Not enough info");
//        }
//
//        if (secondRecommended != -1) {
//            System.out.println(dataStructures[secondRecommended]);
//            DSI.getInfo(dataStructures[secondRecommended]);
//        } else {
//            System.out.println("Not enough info");
//        }
//
//        if (secondRecommended != -1) {
//            System.out.println(dataStructures[thirdRecommended]);
//            DSI.getInfo(dataStructures[thirdRecommended]);
//        } else {
//            System.out.println("Not enough info");
//        }
    }

}
