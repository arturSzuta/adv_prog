package day3;

import java.util.List;

public class Varargs {
    public static void main(String[] args) {
        print(List.of("ala", "ma", "kota"));
        System.out.println("***");
        printUsingVarargs("ala", "ma", "kota");
        System.out.println("***");
        printUsingVarargs();


    }

    //Lista
    public static void print(List<String> inputs) {
        for (String input : inputs) {
            System.out.println(input);
        }

    }

    //Tablica
    public static void print2(String[] inputs) {
        for (String input : inputs) {
            System.out.println(input);
        }

    }

    //Varargs
    public static void printUsingVarargs(String... inputs) {
        for (String input : inputs) {
            System.out.println(input);
        }
    }
}