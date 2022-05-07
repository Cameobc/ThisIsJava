package collectionFramework.map.binaryTree.treeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "a");
        scores.put(98, "b");
        scores.put(75, "c");
        scores.put(95, "d");
        scores.put(80, "e");

        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : descendingEntrySet) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
        System.out.println();

        NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
        Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

    }
}
