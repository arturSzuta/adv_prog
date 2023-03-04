package day1;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("0", "value0_1");
        storage.addToStorage("1", "value0_2");
        storage.addToStorage("0", "value0_3");
        System.out.println();
        storage.printValues("0");
    }
}
