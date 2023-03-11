package day3;

public class Task27 {
    public static void main(String[] args) {
        Joiner<String> joiner = new Joiner<>("|");
        //Joiner joiner = new Joiner<>("|");
        String result = joiner.join("a", "r", "c");
        System.out.println(result);
    }
}
