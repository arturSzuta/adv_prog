package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task14 {
    public static void main(String[] args) {

        int listSize = 10000;
        List<Integer> randomList = new ArrayList<>(listSize);

        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i=0; i<listSize; i++)
        {
            Integer r = rand.nextInt() % 256;
            randomList.add(r);
        }
        randomList.forEach(System.out::println);
        System.out.println("*****");
        List<Integer> uniqueValues = getUniqueValues(randomList);
        uniqueValues.forEach(System.out::println);
        System.out.println("*****");
        List<Integer> duplicatedValues = getDuplicatedValues(randomList);
        duplicatedValues.forEach(System.out::println);

    }

    public static List<Integer> getUniqueValues(List<Integer> input) {
        List<Integer> output = input.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(value -> value.getValue() == 1)
                .map(value -> value.getKey())
                .toList();
        return output;
    }
    public static List<Integer> getDuplicatedValues(List<Integer> input) {
        List<Integer> output = input.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(value -> value.getValue() >= 2)
                .map(value -> value.getKey())
                .toList();
        return output;
    }
}
