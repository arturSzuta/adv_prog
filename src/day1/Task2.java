package day1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> unsorted = new ArrayList<>();
        unsorted.add("Mike");
        unsorted.add("Adam");
        unsorted.add("gorge");

        Collections.sort(unsorted, String.CASE_INSENSITIVE_ORDER);
        System.out.println(unsorted);
    }
}
