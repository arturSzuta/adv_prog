package day1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<String> unsorted = new ArrayList<>();
        unsorted.add("Mike");
        unsorted.add("Adam");
        unsorted.add("Gorge");

        System.out.println(sortUsingOwnComparator(unsorted));
        System.out.println(sortUsingLambda(unsorted));
        System.out.println(sortUsingStream(unsorted));

    }

    private static List<String> sortUsingOwnComparator(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }
    private static List<String> sortUsingLambda(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, (o1, o2) -> -o1.compareTo(o2));
        return sorted;
    }
    private static List<String> sortUsingStream(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
                .sorted(Comparator.reverseOrder()).toList();
    }
}
