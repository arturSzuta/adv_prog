package day1;

import java.util.*;

public class Task6 {
    public  void getFirstAndLastEntry (TreeMap treeMap) {
        Set<Map.Entry> result = new TreeSet<>();
            result.add(treeMap.firstEntry());
            result.add(treeMap.lastEntry());
            result.forEach(System.out::println);
    }
}
